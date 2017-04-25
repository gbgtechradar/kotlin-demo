package gbgtechradar.kotlin.demo.collections

fun isEven(i: Int): Boolean = i % 2 == 0

class DemoCollections {

    fun listDemo() {
        val immutableStringList = listOf("gbg", "tech", "radar", "with", "peter", "and", "robin")

        val doubledList = immutableStringList + immutableStringList
        println("doubledList: " + doubledList)

        val newStringList = immutableStringList.mapIndexed { index, s -> if (isEven(index)) s.toUpperCase() else s }
        println("mutableStringList: " + newStringList.joinToString { it })


        val mutableStringList = mutableListOf<String>("gbg", "tech", "radar")

        mutableStringList += mutableStringList
        println("concatenated mutableStringList: " + mutableStringList)

        val newMutableList = mutableStringList.mapIndexed { index, s -> if (isEven(index)) s.toUpperCase() else s }
        println("mutableStringList: " + newMutableList.joinToString { it })
    }

    fun groupDemo() {
        val immutableStringList = listOf("gbg", "tech", "radar", "with", "peter", "and", "robin")

        val dictionary = mutableMapOf<Int, MutableList<String>>(
                Pair(3, mutableListOf<String>("cat", "dog")),
                Pair(5, mutableListOf<String>("heros"))
        )

        val groupedByLength = immutableStringList.groupByTo(dictionary, { it.length })

        println(groupedByLength)

    }
}

fun main(args: Array<String>) {

    val demoCollection = DemoCollections()

    demoCollection.listDemo()
    demoCollection.groupDemo()

}
