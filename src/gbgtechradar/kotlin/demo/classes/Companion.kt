package gbgtechradar.kotlin.demo.classes

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }

    fun show() {
        println( "hello")
    }
}

fun main(args: Array<String>) {
    val myClass = MyClass.create()

    myClass.show()
}