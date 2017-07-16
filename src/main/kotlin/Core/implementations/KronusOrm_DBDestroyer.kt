package Core.implementations

import Core.interfaces.DBDestroyer
import Core.interfaces.DBEntity

/**
 * Created by victoralisson on 16/07/17.
 */
interface KronusOrm_DBDestroyer: DBDestroyer {

    override fun delete(instance: DBEntity) {
        tableManager.destroy(instance)
    }
}