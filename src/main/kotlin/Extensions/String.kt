package Extensions

/**
 * Created by sanf0rd on 10/07/17.
 */

fun String.isEqual(string: String): Boolean {
    return this == string || this.equals(string)
}

val String.Companion.EMPTY: String
    get() = ""