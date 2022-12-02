package day2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import util.TestFiles

class Day2 {
    @Test
    fun examplePuzzle1() {
        val file = TestFiles.readTestFile("day2/example.txt")
        val strategy = StrategyReader.read(file)
        val method = ShapeMethod()

        assertEquals(3, strategy.strategies.size)
        assertEquals(15, strategy.calculateTotalScore(method))
    }

    @Test
    fun puzzle1() {
        val file = TestFiles.readTestFile("day2/input1.txt")
        val strategy = StrategyReader.read(file)
        val method = ShapeMethod()

        val result = strategy.calculateTotalScore(method)
        println("Result: $result")
        assertEquals(13009, result)
    }

    @Test
    fun examplePuzzle2() {
        val file = TestFiles.readTestFile("day2/example.txt")
        val strategy = StrategyReader.read(file)
        val method = OutcomeMethod()

        assertEquals(3, strategy.strategies.size)
        assertEquals(12, strategy.calculateTotalScore(method))
    }

    @Test
    fun puzzle2() {
        val file = TestFiles.readTestFile("day2/input1.txt")
        val strategy = StrategyReader.read(file)
        val method = OutcomeMethod()

        val result = strategy.calculateTotalScore(method)
        println("Result: $result")
        assertEquals(10398, result)
    }
}