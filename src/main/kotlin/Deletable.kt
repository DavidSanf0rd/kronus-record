import Core.interfaces.DBEntity

/**
 * Created by victoralisson on 19/06/17.
 */

interface Deletable<T: DataModel>: Referable, DBEntity {
    fun delete() {
        println("Deletando usuário")
    }
}