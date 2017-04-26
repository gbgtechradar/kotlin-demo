package gbgtechradar.kotlin.demo.delegates

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

class UserFromMap(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

class MutableUser(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}

fun main(args: Array<String>) {

    println( "Before User creation")
    val user = User()
    user.name = "first"
    user.name = "second"
    println( "After User creation")


    val userFromMap = UserFromMap(mapOf(
            "name" to "John Doe",
            "age"  to 25
    ))
    println( "${userFromMap.name} is ${userFromMap.age} years old.")

    val mutableMap: MutableMap<String, Any?> = mutableMapOf(
            "name" to "John Doe",
            "age" to 25
    )
    val mutableUser = MutableUser(mutableMap)
    println( "${mutableUser.name} is ${mutableUser.age} years old.")
    mutableMap.put("age", 42)
    println( "${mutableUser.name} is ${mutableUser.age} years old.")
}
