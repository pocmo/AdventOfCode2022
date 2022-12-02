package day2


interface StrategyMethod {
    fun calculateScore(strategy: Strategy): Int
}

// Treat output as a shape (rock, paper, scissors)
class ShapeMethod : StrategyMethod {
    override fun calculateScore(strategy: Strategy): Int {
        val output = outputToShape(strategy.output)
        val result = play(strategy.input, output)
        return output.points + result.points
    }

    private fun outputToShape(output: Output): Shape {
        return when(output) {
            Output.X -> Shape.Rock
            Output.Y -> Shape.Paper
            Output.Z -> Shape.Scissors
        }
    }
}

// Treat output as an outcome (lose, draw, win)
class OutcomeMethod : StrategyMethod {
    override fun calculateScore(strategy: Strategy): Int {
        val pick = outputToShape(strategy.output, strategy.input)
        val result = play(strategy.input, pick)
        return pick.points + result.points
    }

    private fun outputToShape(output: Output, input: Shape): Shape {
        return when(output) {
            Output.X -> input.winsAgainst() // Lose
            Output.Y -> input // Draw
            Output.Z -> input.losesAgainst() // Win
        }
    }
}

