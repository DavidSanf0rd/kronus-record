package Core.interfaces

import java.util.ArrayList

/**
 * Created by Sanf0rd on 15/07/17.
 */
interface DBWriter: DBOperator {
    fun save(instance: DBEntity)
}
