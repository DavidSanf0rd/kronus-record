package SqlBuilder

import Core.interfaces.DBEntity

/**
 * Created by Sanf0rd on 16/07/17.
 */

fun SqlBuilder.Companion.selectAllFrom(entity: DBEntity): String {
    return "SELECT * FROM ${entity.javaClass.simpleName};"
}