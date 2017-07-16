package Core

import java.sql.Connection

/**
* Created by Sanf0rd on 15/07/17.
*/
interface DBConnectable {
    var databaseName: String?
    var databasePath: String?

    var connection: Connection?

    fun connect()
    fun disconnect()
}