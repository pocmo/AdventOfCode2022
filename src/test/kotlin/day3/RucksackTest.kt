package day3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import util.TestFiles

internal class RucksackTest {
    @Test
    fun exampleItems() {
        val file = TestFiles.readTestFile("day3/example.txt")
        val rucksacks = RucksackReader.read(file)

        assertEquals('p', rucksacks[0].itemInBoth())
        assertEquals('L', rucksacks[1].itemInBoth())
        assertEquals('P', rucksacks[2].itemInBoth())
        assertEquals('v', rucksacks[3].itemInBoth())
        assertEquals('t', rucksacks[4].itemInBoth())
        assertEquals('s', rucksacks[5].itemInBoth())
    }
}