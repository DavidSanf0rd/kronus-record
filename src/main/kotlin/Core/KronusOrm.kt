package Core

import Core.implementations.KronusOrm_DBConnector
import Core.implementations.KronusOrm_DBReader
import Core.implementations.KronusOrm_DBWriter
import java.sql.Connection

/**
 * Created by sanf0rd on 09/07/17.
 */
class KronusOrm(): KronusOrm_DBConnector, KronusOrm_DBWriter, KronusOrm_DBReader {

    override var databaseName: String? = null
    override var databasePath: String? = null

    lateinit override var connection: Connection
    override val tableManager: TableManager by lazy { TableManager(connection) }

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