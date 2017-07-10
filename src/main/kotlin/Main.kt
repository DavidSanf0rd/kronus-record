import kotlin.reflect.full.memberProperties

/**
 * Created by sanf0rd on 19/06/17.
 */

interface Test {
    fun hehe() {
        val clazz = this.javaClass.kotlin
        clazz.memberProperties.forEach {
            println("${it.name} --[${it.returnType}]---> ${it.get(this)}")
        }
    }
}

class MyData(val name: String, val age: Int): Test

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {

    val data = MyData(name = "Sanford", age = 19)
    data.hehe()
}