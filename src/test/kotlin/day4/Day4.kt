package day4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import util.TestFiles

class Day4 {
    @Test
    fun example() {
        val file = TestFiles.readTestFile("day4/example.txt")
        val pairs = ElfPairReader.read(file)

        assertEquals(2, pairs.countPairsContainingEachOther())
        assertEquals(4, pairs.countOverlappingPairs())

    }

    @Test
    fun puzzle1() {
        val file = TestFiles.readTestFile("day4/input1.txt")
        val pairs = ElfPairReader.read(file)

        val result = pairs.countPairsContainingEachOther()
        println("Result: $result")
        assertEquals(503, result)
    }

    @Test
    fun puzzle2() {
        val file = TestFiles.readTestFile("day4/input1.txt")
        val pairs = ElfPairReader.read(file)

        val result = pairs.countOverlappingPairs()
        println("Result: $result")
        assertEquals(827, result)
    }
}