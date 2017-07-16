package Core.implementations

import Core.interfaces.DBEntity
import Core.interfaces.DBReader
import kotlin.reflect.KClass

/**
 * Created by Sanf0rd on 16/07/17.
 */
interface KronusOrm_DBReader: DBReader {
    override fun <T: DBEntity> allFrom(entity: KClass<T>): List<DBEntity> {
        return tableManager.allRegistersFor(entity)
    }

    override fun instanceWith(id: Long): DBEntity {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}