package day4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import util.TestFiles

internal class ElfPairReaderTest {
    @Test
    fun readExample() {
        val file = TestFiles.readTestFile("day4/example.txt")
        val pairs = ElfPairReader.read(file)

        assertEquals(6, pairs.size)
    }
}