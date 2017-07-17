package SqlBuilder

import ActiveRecord.KronusRecord
import Core.interfaces.DBEntity
import Extensions.isPrimaryKey
import com.sun.javaws.exceptions.MissingFieldException
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.kotlinProperty

/**
 * Created by victoralisson on 17/07/17.
 */

fun <T: DBEntity>SqlBuilder.Companion.destroyAll(entity: KClass<T>): String {
    return "Delete FROM ${entity.simpleName};"
}

fun SqlBuilder.Companion.deleteRowFor(entity: DBEntity): String {
    val entityName = entity.javaClass.simpleName
    val entityKclass = entity.javaClass.kotlin
    val fields = entity.javaClass.declaredFields + entity.javaClass.superclass.declaredFields

    val primaryKey = fields.first { it.isPrimaryKey() }

    val primaryKeyProperty = entityKclass.memberProperties
            .find { it.name == primaryKey.name } ?: throw IllegalStateException("You must have a primaryKey")

    val primaryKeyValue = primaryKeyProperty.get(entity) ?: throw IllegalStateException("PrimaryKey is nil")

    return "DELETE FROM ${entityName} WHERE id = ${primaryKeyValue}"
}