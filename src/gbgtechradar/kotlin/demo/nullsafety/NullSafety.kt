package gbgtechradar.kotlin.demo.nullsafety

class User {
    var name : String? = null
}

class NullSafety {

    var user : User? = null

    fun examples() {

        var a: String = "abc"
        //a = null     compilation error

        var b: String? = "abc"
        //b.length     compilation error
        b = null // ok

        val ns = NullSafety()

        ns.user?.name
    }

    fun alwaysTrue(b:String?) : Boolean {
        val traditional : Int = if (b != null) b.length else -1

        val elvis = b?.length ?: -1

        return traditional == elvis
    }

    fun willThrowNPE() {
        var b: String? = null
        val l = b!!.length

    }

    fun safeCast() {

        var a: Any = "abc"
        val aInt: Int? = a as? Int
        // aInt is null
    }
}

fun main(args :Array<String>) {

    val ns = NullSafety()

    println( ns.user?.name)

    println( ns.alwaysTrue("hello"))
    println(ns.alwaysTrue(null))

}