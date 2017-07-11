/**
 * Created by victoralisson on 19/06/17.
 */

interface Deletable<T: DataModel> {
    fun delete() {
        println("Deletando usuário")
    }
}