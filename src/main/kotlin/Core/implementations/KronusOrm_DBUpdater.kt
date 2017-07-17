package Core.implementations

import Core.interfaces.DBEntity
import Core.interfaces.DBUpdater

/**
 * Created by Sanf0rd on 17/07/17.
 */
interface KronusOrm_DBUpdater: DBUpdater {

    override fun update(instance: DBEntity) {
        tableManager.updateRowFor(instance)
    }
}