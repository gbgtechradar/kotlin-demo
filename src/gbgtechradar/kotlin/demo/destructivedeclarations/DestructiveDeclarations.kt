package gbgtechradar.kotlin.demo.destructivedeclarations

class DestructiveDeclarations {

    private fun fishes(): Triple<Int, String, Double> {
        return Triple(4, "Shark", 124.0)
    }

    fun example() {
        val (_, fishName, weight) = fishes()
        println("$fishName has a weight of $weight")
    }
}

fun main(args: Array<String>) {
    val dd = DestructiveDeclarations()

    dd.example()
}