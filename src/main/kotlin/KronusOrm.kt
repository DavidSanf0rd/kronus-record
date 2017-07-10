import Helpers.OperationalSystem
import java.sql.Connection
import java.sql.DriverManager

/**
 * Created by sanf0rd on 09/07/17.
 */
class KronusOrm() {

    private var databaseName: String? = null
    private var databasePath: String? = null

    var connection: Connection? = null

    constructor(databaseName: String): this() {
        this.databaseName = databaseName
        connect()
    }

    constructor(databaseName: String, databasePath: String) : this() {
        this.databaseName = databaseName
        this.databasePath = databasePath

        connect()
    }

    fun connect() {
        var databaseName = databaseName?.let { it } ?: return //trow an error in future

        if (databaseName.endsWith(".db")) {
            databaseName = "$databaseName.db"
            this.databaseName = databaseName
        }

        if (databasePath.isNullOrEmpty()) {
            databasePath = OperationalSystem.homeDir
        }

        val dbUrl: String

        if(OperationalSystem.isAndroid()) {
            Class.forName("org.sqldroid.SQLDroidDriver")
            dbUrl = "jdbc:sqldroid:$databasePath/$databaseName"
        } else {
            Class.forName("org.sqlite.JDBC")
            dbUrl = "jdbc:sqlite:$databasePath/$databaseName"
        }

        connection = DriverManager.getConnection(dbUrl)
    }

    /**
     * Method to close database connection
     */
    fun close() {
        connection?.close()
    }
}