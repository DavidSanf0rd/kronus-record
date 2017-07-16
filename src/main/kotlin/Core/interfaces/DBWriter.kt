package Core.interfaces

/**
 * Created by Sanf0rd on 15/07/17.
 */
interface DBWriter: DBOperator {
    fun save(instance: Any)
}