import Core.KronusOrm
import Core.TableManager
import Core.extensions.listWith
import Core.interfaces.DBEntity

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

//class MyData(val name: String, val age: Int): Test

//data class User(val name: String, val age: Int)

fun main(args: Array<String>) {

//    val data = MyData(name = "Sanford", age = 19)
//    data.hehe()

    val kronus = KronusOrm("gabi.db")

    val user = User(email ="cao@gmail.com", name = "vó")
//    val result = kronus.save(user)

    print(j)
}