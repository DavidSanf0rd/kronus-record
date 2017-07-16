package ActiveRecord

import Core.KronusOrm
import Core.interfaces.DBEntity

/**
 * Created by victoralisson on 19/06/17.
 */

interface Referable {
    val context: KronusOrm?
}

interface DataModel : ActiveRecord, DBEntity {

}