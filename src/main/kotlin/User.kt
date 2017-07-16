import Core.interfaces.DBEntity

/**
 * Created by victoralisson on 19/06/17.
 */

data class User(var name: String, var email: String) : DataModel, DBEntity {

    fun teste() {
        print("teste")
    }
}