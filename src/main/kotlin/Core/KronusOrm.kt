package Core

import Extensions.OperationalSystem
import java.sql.Connection
import java.sql.DriverManager

/**
 * Created by sanf0rd on 09/07/17.
 */
class KronusOrm(): KronusOrm_DBConnectable {

    override var databaseName: String? = null
    override var databasePath: String? = null

    override var connection: Connection? = null

    constructor(databaseName: String): this() {
        this.databaseName = databaseName
        connect()
    }

    constructor(databaseName: String, databasePath: String) : this() {
        this.databaseName = databaseName
        this.databasePath = databasePath

        connect()
    }
}