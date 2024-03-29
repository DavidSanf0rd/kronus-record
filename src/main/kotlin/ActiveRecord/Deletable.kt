package ActiveRecord

import Core.interfaces.DBEntity

/**
 * Created by victoralisson on 19/06/17.
 */

interface Deletable<T: DataModel>: Referable, DBEntity {
    fun destroy() {
        this.context?.deleteTableFor(this::class)
    }

    fun delete() {
        this.context?.delete(this)
    }
}