import ActiveRecord.KronusRecord

/**
 * Created by victoralisson on 19/06/17.
 */

data class User(var name: String, var email: String) : KronusRecord() {
}