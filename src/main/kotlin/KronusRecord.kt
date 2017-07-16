import Core.KronusOrm
import Annotation.*

/**
 * Created by Sanf0rd on 16/07/17.
 */
open class KronusRecord() : DataModel {
    @PrimaryKey
    @AutoIncrement
    var id: Int? = null
    override val context: KronusOrm?
        get() = KronusOrm("victor.db")

}