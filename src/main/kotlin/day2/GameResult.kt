package day2

sealed class GameResult(val points: Int) {
    object Win: GameResult(6)
    object Draw: GameResult(3)
    object Loss : GameResult(0)
}

fun play(input: Shape, output: Shape): GameResult {
    return when {
        input == output -> GameResult.Draw
        input.winsAgainst() == output -> GameResult.Loss
        output.winsAgainst() == input -> GameResult.Win
        else -> error("No result for: $input vs. $output")
    }
}