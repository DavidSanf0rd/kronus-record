package Core.interfaces

import java.sql.Connection

/**
* Created by Sanf0rd on 15/07/17.
*/
interface DBConnector {
    var databaseName: String?
    var databasePath: String?

    var connection: Connection

    fun connect()
    fun disconnect()
}