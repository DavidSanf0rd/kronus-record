package SqlBuilder

import Core.interfaces.DBEntity
import kotlin.reflect.KClass

/**
 * Created by victoralisson on 17/07/17.
 */

fun <T: DBEntity>SqlBuilder.Companion.destroyAll(entity: KClass<T>): String {
    return "Delete FROM ${entity.simpleName};"
}