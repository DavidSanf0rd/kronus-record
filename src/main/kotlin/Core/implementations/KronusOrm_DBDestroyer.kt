package Core.implementations

import Core.interfaces.DBDestroyer
import Core.interfaces.DBEntity
import kotlin.reflect.KClass

/**
 * Created by victoralisson on 16/07/17.
 */
interface KronusOrm_DBDestroyer: DBDestroyer {

    override fun delete(instance: DBEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : DBEntity> deleteTableFor(entity: KClass<T>) {
        tableManager.destroy(entity)
    }
}