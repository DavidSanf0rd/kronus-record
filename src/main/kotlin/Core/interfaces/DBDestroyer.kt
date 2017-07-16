package Core.interfaces

/**
 * Created by Sanf0rd on 15/07/17.
 */
interface DBDestroyer: DBOperator {
    fun delete(instance: DBEntity)
}