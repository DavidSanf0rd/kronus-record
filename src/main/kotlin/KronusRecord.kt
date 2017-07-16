import Core.KronusOrm
import Core.interfaces.DBEntity

/**
 * Created by Sanf0rd on 16/07/17.
 */
open class KronusRecord() : DataModel {

    override val context: KronusOrm?
        get() = KronusOrm("gabi.db")
}