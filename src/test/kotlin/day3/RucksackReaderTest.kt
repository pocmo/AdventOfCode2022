package day3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import util.TestFiles

internal class RucksackReaderTest {
    @Test
    fun readingExample() {
        val file = TestFiles.readTestFile("day3/example.txt")
        val rucksacks = RucksackReader.read(file)

        assertEquals(6, rucksacks.size)

        assertRucksack("vJrwpWtwJgWr", "hcsFMMfFFhFp", rucksacks[0])
        assertRucksack("jqHRNqRjqzjGDLGL", "rsFMfFZSrLrFZsSL", rucksacks[1])
        assertRucksack("PmmdzqPrV", "vPwwTWBwg", rucksacks[2])
    }
}

private fun assertRucksack(
    first: String,
    second: String,
    rucksack: Rucksack
) {
    assertEquals(first.toCharArray().toList(), rucksack.first)
    assertEquals(second.toCharArray().toList(), rucksack.second)
}