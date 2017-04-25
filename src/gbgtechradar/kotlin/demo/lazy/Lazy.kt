package gbgtechradar.kotlin.demo.lazy

/**
 * ref: http://stackoverflow.com/questions/36623177/kotlin-property-initialization-using-by-lazy-vs-lateinit
 */

fun calculateValue(): String {
    return "cpuIntensiveResult"
}

public class Hello {
    val myLazyString: String by lazy { "Lazy: ${calculateValue()}" }

    lateinit var subject: String

    fun setup() {
        subject = calculateValue()
    }

    fun test() {
        println("Test: $subject")
    }
}

fun main(args : Array<String>) {
    val hello = Hello()
    println("After constructor")
    println( hello.myLazyString)

    // hello.test()       will throw kotlin.UninitializedPropertyAccessException
    hello.setup()
    hello.test()
}