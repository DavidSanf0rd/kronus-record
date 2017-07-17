package Core.interfaces

import kotlin.reflect.KClass

/**
 * Created by Sanf0rd on 15/07/17.
 */
interface DBDestroyer: DBOperator {
    fun delete(instance: DBEntity)

    fun <T: DBEntity>deleteTableFor(entity: KClass<T>)
}