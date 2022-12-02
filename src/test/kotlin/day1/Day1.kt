package day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import util.TestFiles

class Day1 {
    @Test
    fun example() {
        val reader = Reader()
        val elves = reader.readFile(TestFiles.readTestFile("day1/example.txt"))

        assertEquals(5, elves.size)
        assertEquals(4, elves.findMostCaloriesElfNumber())
        assertEquals(24000, elves.findMostCaloriesByElf())
        assertEquals(45000, elves.sumOfTopThree())
    }

    @Test
    fun puzzle1() {
        val reader = Reader()
        val elves = reader.readFile(TestFiles.readTestFile("day1/input1.txt"))

        val calories = elves.findMostCaloriesByElf()
        println("Result: $calories")
        assertEquals(70116, calories)
    }

    @Test
    fun puzzle2() {
        val reader = Reader()
        val elves = reader.readFile(TestFiles.readTestFile("day1/input1.txt"))

        val sum = elves.sumOfTopThree()
        println("Result: $sum")
        assertEquals(206582, sum)
    }
}
