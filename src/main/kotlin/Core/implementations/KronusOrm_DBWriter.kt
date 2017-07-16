package Core.implementations

import Core.interfaces.DBEntity
import Core.interfaces.DBWriter

/**
 * Created by Sanf0rd on 15/07/17.
 */
interface KronusOrm_DBWriter: DBWriter {

    override fun save(instance: DBEntity) {
        tableManager.save(instance)
    }
}