package SqlBuilder

import Extensions.*

/**
 * Created by sanf0rd on 10/07/17.
 */
fun SqlBuilder.Companion.create(clazz: Any): String {
    if (clazz.javaClass.declaredFields.isEmpty()) {
        return "Class without field is not allowed."
    }

    val queryBuilder = StringBuilder()
    queryBuilder.append("CREATE TABLE IF NOT EXISTS ${clazz.javaClass.simpleName}(")

    val fields = clazz.javaClass.declaredFields + clazz.javaClass.superclass.declaredFields

    var isFirst = true
    for (field in fields) {
        if (field.isIgnore().not() && field.isAutoGeneratedMetaData().not()) {
            if (isFirst.not())
                queryBuilder.append(", ")

            val fieldPart = field.sql
            queryBuilder.append(fieldPart.trim())

            isFirst = false
        }
    }
    queryBuilder.append(");")
    return queryBuilder.toString()
}