package day3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import util.TestFiles

internal class RucksackListKtTest {
    @Test
    fun example_sumBadgePrioritiesChunked() {
        val file = TestFiles.readTestFile("day3/example.txt")
        val rucksacks = RucksackReader.read(file)

        assertEquals(70, rucksacks.sumBadgePrioritiesChunked())
    }
}
