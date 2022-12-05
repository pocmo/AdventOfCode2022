package day5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import util.TestFiles

class Day5 {
    @Test
    fun example_puzzle1() {
        val file = TestFiles.readTestFile("day5/example.txt")
        val (stacks, instructions) = CrateAndInstructionReader.read(file)

        Crane.execute(stacks, instructions)

        val result = stacks.onlyTops()
        println(result)
        assertEquals("CMZ", result)
    }

    @Test
    fun example_puzzle2() {
        val file = TestFiles.readTestFile("day5/example.txt")
        val (stacks, instructions) = CrateAndInstructionReader.read(file)

        Crane.executeOptimized(stacks, instructions)

        val result = stacks.onlyTops()
        println(result)
        assertEquals("MCD", result)
    }

    @Test
    fun puzzle1() {
        val file = TestFiles.readTestFile("day5/day1.txt")
        val (stacks, instructions) = CrateAndInstructionReader.read(file)

        Crane.execute(stacks, instructions)

        val result = stacks.onlyTops()
        println("Result: $result")
        assertEquals("FRDSQRRCD", result)
    }

    @Test
    fun puzzle2() {
        val file = TestFiles.readTestFile("day5/day1.txt")
        val (stacks, instructions) = CrateAndInstructionReader.read(file)

        Crane.executeOptimized(stacks, instructions)

        val result = stacks.onlyTops()
        println("Result: $result")
        assertEquals("HRFTQVWNN", result)
    }
}