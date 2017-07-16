package Core.interfaces

import kotlin.reflect.KClass

/**
 * Created by Sanf0rd on 15/07/17.
 */
interface DBReader: DBOperator {
    fun <T: DBEntity>allFrom(entity: KClass<T>): List<DBEntity>
    fun instanceWith(id: Long): DBEntity
}