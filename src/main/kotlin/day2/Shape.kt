package day2

sealed class Shape(
    val value: Char,
    val points: Int,
) {
    object Rock: Shape('A', 1)
    object Paper: Shape('B', 2)
    object Scissors: Shape('C', 3)

    fun winsAgainst(): Shape {
        return when (this) {
            Shape.Rock -> Shape.Scissors
            Shape.Paper -> Shape.Rock
            Shape.Scissors -> Shape.Paper
        }
    }

    fun losesAgainst(): Shape {
        return when (this) {
            Shape.Rock -> Shape.Paper
            Shape.Paper -> Shape.Scissors
            Shape.Scissors -> Shape.Rock
        }
    }
}
