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

    val kronus = KronusOrm("novo.db")
    val tableManager = TableManager(kronus.connection!!)

    val user = User(email ="victoralissont5@gmail.com", name = "vó")

    val result = tableManager.save(user)

    print(result)
}
