package day2

import java.io.File

object StrategyReader {
    fun read(file: File): StrategyGuide {
        val strategies = mutableListOf<Strategy>()

        file.readLines().forEach { line ->
            if (line.isNotEmpty()) {
                strategies.add(readStrategy(line))
            }
        }

        return StrategyGuide(strategies)
    }

    private fun readStrategy(line: String): Strategy {
        return Strategy(
            input = determineShape(line[0]),
            output = determineOutput(line[2])
        )
    }

    private fun determineShape(char: Char): Shape {
        return when (char) {
            Shape.Paper.value -> Shape.Paper
            Shape.Rock.value -> Shape.Rock
            Shape.Scissors.value -> Shape.Scissors
            else -> error("Unknown character: $char")
        }
    }

    private fun determineOutput(char: Char): Output {
        return when (char) {
            Output.X.value -> Output.X
            Output.Y.value -> Output.Y
            Output.Z.value -> Output.Z
            else -> error("Unknown character: $char")
        }
    }
}