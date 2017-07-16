import Core.interfaces.DBEntity
import Annotation.*

/**
 * Created by Sanf0rd on 16/07/17.
 */
open class KronusRecord() : DataModel, DBEntity {

    @PrimaryKey
    @AutoIncrement
    var id: Int? = null
}