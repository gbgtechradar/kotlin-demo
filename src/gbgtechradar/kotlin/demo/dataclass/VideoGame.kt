package gbgtechradar.kotlin.demo.dataclass

/**
 * Reference: https://medium.com/@DarrenAtherton/intro-to-data-classes-in-kotlin-7f956d54365c
 */
data class VideoGame(val name: String, val publisher: String, var reviewScore: Int)

val game: VideoGame = VideoGame("Gears of War", "Epic Games", 8)

fun main(args: Array<String>) {
    println(game)
}