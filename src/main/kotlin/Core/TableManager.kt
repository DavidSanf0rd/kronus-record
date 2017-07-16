package Core

import Core.interfaces.DBEntity
import Extensions.asListOf
import SqlBuilder.*
import java.sql.Connection
import java.sql.Statement
import kotlin.properties.Delegates
import kotlin.reflect.KClass

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

    fun destroy(clazz: Any) {
        try {
            statement.execute(SqlBuilder.destroyAll(clazz))
        } catch (exception: Exception) {
            println(exception)
        }
    }
    fun <T: DBEntity>allRegistersFor(entity: KClass<T>): List<DBEntity> {
        val query = SqlBuilder.selectAllFrom(entity)

        try {
            val resultSet = statement.executeQuery(query)
            return resultSet.asListOf(entity)
        }catch (exception: Exception) {
            println("Malformed query <$query>. Caused by ${exception.message}")
        }
        return mutableListOf()

    }
}