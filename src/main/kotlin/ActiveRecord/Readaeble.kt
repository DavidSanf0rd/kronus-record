package ActiveRecord

import Core.interfaces.DBEntity

/**
 * Created by victoralisson on 19/06/17.
 */

interface Readable<T: DataModel>: Referable, DBEntity {

    fun all(): List<DBEntity>? {
        val all = this.context?.allFrom(this::class)
        return all
   }
}

/**
 * Use this temporaly to return a llist of the own entity
 */
fun <T : Readable<DataModel>> T.listAll(): List<T> {
    val all = this.context?.allFrom(this::class)
    return all as List<T>
}