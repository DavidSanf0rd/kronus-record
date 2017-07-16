package SqlBuilder

import Core.interfaces.DBEntity
import kotlin.reflect.KClass

/**
 * Created by Sanf0rd on 16/07/17.
 */

fun <T: DBEntity>SqlBuilder.Companion.selectAllFrom(entity: KClass<T>): String {
    return "SELECT * FROM ${entity.simpleName};"
}
