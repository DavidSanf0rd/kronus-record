package SqlBuilder

import Core.interfaces.DBEntity
import Extensions.isAutoGeneratedMetaData
import Extensions.isAutoIncrement
import Extensions.isIgnore
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

/**
 * Created by sanf0rd on 10/07/17.
 */
fun SqlBuilder.Companion.insert(instance: Any): String {
    val kClazz = instance.javaClass.kotlin
    val queryBuilder = StringBuilder()
    queryBuilder.append("INSERT INTO ${instance.javaClass.simpleName}")

    val keyBuilder = StringBuilder("(")
    val valueBuilder = StringBuilder(" VALUES(")

    val fields = instance.javaClass.declaredFields + instance.javaClass.superclass.declaredFields

    var isFirst = true
    for (field in fields) {
        val kProperty = kClazz.memberProperties.find { it.name == field.name }

        if (field.isIgnore().not() && field.isAutoGeneratedMetaData().not()) {
            if (field.isAutoIncrement())
                continue

            if (isFirst.not()) {
                keyBuilder.append(",")
                valueBuilder.append(",")
            }

            keyBuilder.append(field.name)
            if (kProperty != null) {
                if (kProperty.get(instance) is String)//if (objectAsJson.get(field.name).isString)
                    valueBuilder.append("'${kProperty.get(instance)}'")
                else if (kProperty.get(instance) is Boolean) {
                    if (kProperty.get(instance) as Boolean)
                        valueBuilder.append("1")
                    else valueBuilder.append("0")
                } else valueBuilder.append(kProperty.get(instance))
            }

            isFirst = false
        }
    }

    keyBuilder.append(")")
    valueBuilder.append(")")

    queryBuilder.append(keyBuilder)
    queryBuilder.append(valueBuilder)
    queryBuilder.append(";")

    //log(this.javaClass.simpleName, queryBuilder.toString())
    return queryBuilder.toString()
}

