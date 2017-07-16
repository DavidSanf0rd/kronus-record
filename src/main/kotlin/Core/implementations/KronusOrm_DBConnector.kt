package Core.implementations

import Core.interfaces.DBConnector
import Extensions.OperationalSystem
import java.sql.DriverManager

/**
 * Created by David Sanford on 15/07/17.
 */
interface KronusOrm_DBConnector : DBConnector {

    override fun connect() {
        var databaseName = databaseName?.let { it } ?: return //trow an error in future

        if (databaseName.endsWith(".db").not()) {
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

    override fun disconnect() {
        connection?.close()
    }
}