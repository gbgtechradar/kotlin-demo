package gbgtechradar.kotlin.demo.nullsafety

class User {
    var name : String? = null
}

class NullSafety {

    var user : User? = null

    fun examples():String? {

        var a: String = "abc"
        //a = null     compilation error

        var b: String? = "abc"
        //b.length     compilation error
        b = null // ok

        val ns = NullSafety()

        return ns.user?.name
    }

    fun alwaysTrue(b:String?) : Boolean {
        val traditional : Int = if (b != null) b.length else -1

        val elvis = b?.length ?: -1

        return traditional == elvis
    }

    fun willThrowNPE() {
        val b: String? = null
        //val l1 = b.length   // compilation error
        val l2 = b?.length    // l2 = null
        val l3 = b!!.length   // throws NPE

    }

    fun safeCast() {
        val a: Any = "safeCast"
        val aString: String? = a as? String
        println( "safeCast to String?: $aString")
        val aInt: Int? = a as? Int
        println( "safeCast to Int?: $aInt")    // aInt is null
    }
}

fun main(args :Array<String>) {

    val ns = NullSafety()

    println("examples(): ${ns.examples()}")

    println( "ns.user?.name => ${ns.user?.name}")

    println( ns.alwaysTrue("hello"))
    println(ns.alwaysTrue(null))

    ns.safeCast()

}