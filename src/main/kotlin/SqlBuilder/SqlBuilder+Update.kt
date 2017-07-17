package SqlBuilder

import Extensions.isAutoGeneratedMetaData
import Extensions.isAutoIncrement
import Extensions.isIgnore
import Extensions.isPrimaryKey
import kotlin.reflect.full.memberProperties

/**
 * Created by Sanf0rd on 17/07/17.
 */
fun SqlBuilder.Companion.update(instance: Any): String {
    val entityKclass = instance.javaClass.kotlin
    val queryBuilder = StringBuilder()
    queryBuilder.append("UPDATE ${instance.javaClass.simpleName}")

    val keyBuilder = StringBuilder(" SET ")

    val fields = instance.javaClass.declaredFields + instance.javaClass.superclass.declaredFields

    var isFirst = true
    for (field in fields) {
        val kProperty = entityKclass.memberProperties.find { it.name == field.name }

        if (field.isIgnore().not() && field.isAutoGeneratedMetaData().not()) {
            if (field.isAutoIncrement())
                continue

            if (isFirst.not()) {
                keyBuilder.append(", ")
            }

            keyBuilder.append("${field.name} = ")
            if (kProperty != null) {
                if (kProperty.get(instance) is String)//if (objectAsJson.get(field.name).isString)
                    keyBuilder.append("'${kProperty.get(instance)}'")
                else if (kProperty.get(instance) is Boolean) {
                    if (kProperty.get(instance) as Boolean)
                        keyBuilder.append("1")
                    else keyBuilder.append("0")
                } else keyBuilder.append(kProperty.get(instance))
            }

            isFirst = false
        }
    }

    keyBuilder.append(" ")

    val primaryKey = fields.first { it.isPrimaryKey() }

    val primaryKeyProperty = entityKclass.memberProperties
            .find { it.name == primaryKey.name } ?: throw IllegalStateException("You must have a primaryKey")

    val primaryKeyValue = primaryKeyProperty.get(instance) ?: throw IllegalStateException("PrimaryKey is nil")

    val condition = "WHERE id = ${primaryKeyValue}"

    queryBuilder.append(keyBuilder)
    queryBuilder.append(condition)
    queryBuilder.append(";")

    //log(this.javaClass.simpleName, queryBuilder.toString())
    return queryBuilder.toString()
}