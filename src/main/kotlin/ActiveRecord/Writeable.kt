package ActiveRecord

import Core.interfaces.DBEntity

/**
 * Created by victoralisson on 19/06/17.
 */

open interface Writeable<T: DataModel>: Referable, DBEntity {
    fun save() {
        this.context?.save(this)
    }
}

