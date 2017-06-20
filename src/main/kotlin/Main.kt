import kotlin.reflect.full.declaredMemberProperties

/**
 * Created by sanf0rd on 19/06/17.
 */

fun readProperties(instance: Any) {
    val clazz = instance.javaClass.kotlin
    clazz.declaredMemberProperties.forEach {
        println("${it.name} --[${it.returnType}]---> ${it.get(instance)}")
    }
}

data class MyData(val name: String, val age: Int)

fun main(args: Array<String>) {

    val data = MyData(name = "Sanford", age = 19)

    readProperties(data)
}