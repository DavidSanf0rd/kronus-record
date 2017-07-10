import java.sql.Connection
import java.sql.Statement
import kotlin.properties.Delegates

/**
 * Created by sanf0rd on 10/07/17.
 */
class KronusTableManager(connection: Connection) {

    private var statement: Statement by Delegates.notNull<Statement>()

    init {
        statement = connection.createStatement()
    }

    private fun createTable(clazz: Any) {
        statement.execute(Builder().create(clazz))
        //log(this.javaClass.simpleName, "table ${clazz.javaClass.simpleName} has been created.")
    }

}