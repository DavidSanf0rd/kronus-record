package Core

import SqlBuilder.SqlBuilder
import SqlBuilder.create
import SqlBuilder.insert
import java.sql.Connection
import java.sql.Statement
import kotlin.properties.Delegates

/**
 * Created by sanf0rd on 10/07/17.
 */
class TableManager(connection: Connection) {

    private var statement: Statement by Delegates.notNull<Statement>()

    init {
        statement = connection.createStatement()
    }

    private fun createTable(clazz: Any) {
        statement.execute(SqlBuilder.create(clazz))
    }

    fun save(clazz: Any): Boolean {
        try {
            createTable(clazz)

            statement.execute(SqlBuilder.insert(clazz))
            return true
        } catch (exception: Exception) {
            println("Exception caught when inserting values")
        }
        return false
    }
}