package day3

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import util.TestFiles

class Day3 {
    @Test
    fun puzzle1() {
        val file = TestFiles.readTestFile("day3/input1.txt")
        val rucksacks = RucksackReader.read(file)

        val result = rucksacks.sumOfPriorities()
        println("Result: $result")
        assertEquals(7716, result)
    }

    @Test
    fun puzzle2() {
        val file = TestFiles.readTestFile("day3/input1.txt")
        val rucksacks = RucksackReader.read(file)

        val result = rucksacks.sumBadgePrioritiesChunked()
        println("Result: $result")
        assertEquals(2973, result)
    }
}