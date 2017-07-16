package Core.implementations

import Core.interfaces.DBWriter

/**
 * Created by Sanf0rd on 15/07/17.
 */
interface KronusOrm_DBWriter: DBWriter {

    override fun save(instance: Any) {
        tableManager.save(clazz = instance)
    }
}