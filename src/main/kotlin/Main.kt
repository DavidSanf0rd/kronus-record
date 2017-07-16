import Core.KronusOrm
import Core.TableManager
import Core.interfaces.DBEntity
import org.sqlite.core.DB
import kotlin.reflect.KClass

/**
 * Created by victoralisson on 20/06/17.
 */
//fun main(args: Array<String>) {
//
//    val user = User(name = "Victor", email = "Asfnfsajf")
//    user.save()
//}
//=======
//
//interface Test {
//    fun hehe() {
//        val clazz = this.javaClass.kotlin
//        clazz.memberProperties.forEach {
//            println("${it.name} --[${it.returnType}]---> ${it.get(this)}")
//        }
//    }
//}

//class MyData(val name: String, val age: Int): DBEntity

//data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val user = User(email ="davidSanford@gmail.com", name = "david")
    user.save()

    print(user.all())
}