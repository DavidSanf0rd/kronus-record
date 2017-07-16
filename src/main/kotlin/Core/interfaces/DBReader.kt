package Core.interfaces

import kotlin.reflect.KClass

/**
 * Created by Sanf0rd on 15/07/17.
 */
interface DBReader: DBOperator {
    fun allFrom(entity: KClass<DBEntity>): List<DBEntity>
}