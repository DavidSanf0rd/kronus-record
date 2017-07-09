import java.sql.Connection

/**
 * Created by sanf0rd on 09/07/17.
 */
class KronusOrm() {

    private var databaseName: String? = null
    private var databasePath: String? = null

    var connection: Connection? = null

    constructor(databaseName: String): this() {
        this.databaseName = databaseName
    }

    constructor(databaseName: String, databasePath: String) : this() {
        this.databaseName = databaseName
        this.databasePath = databasePath
    }
}