import java.util.ArrayList

/**
 * Created by victoralisson on 19/06/17.
 */

interface Readable<T: DataModel> {

    fun all(): List<T> {
        println("Trazendo uma lista de usuários")
        return ArrayList<T>()
   }
}