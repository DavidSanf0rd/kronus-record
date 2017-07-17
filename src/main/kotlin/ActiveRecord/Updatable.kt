package ActiveRecord

import Core.interfaces.DBEntity

/**
 * Created by victoralisson on 19/06/17.
 */

interface Updatable<T: DataModel>: Referable, DBEntity {
    fun update() {
        this.context?.update(this)
    }
}