package Helpers

/**
 * Created by sanf0rd on 10/07/17.
 */
class OperationalSystem {
    companion object {
        val homeDir: String
            get() = System.getProperty("user.home")

        fun isAndroid(): Boolean {
            try {
                Class.forName("android.app.Activity")
                return true
            } catch (exception: Exception) {
                return false
            }
        }
    }
}