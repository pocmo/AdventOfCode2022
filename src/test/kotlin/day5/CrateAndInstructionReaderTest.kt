package day5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import util.TestFiles

internal class CrateAndInstructionReaderTest {
    @Test
    fun readExample() {
        val file = TestFiles.readTestFile("day5/example.txt")
        val (stacks, instructions) = CrateAndInstructionReader.read(file)

        stacks.forEachIndexed { index, stack ->
            println("($index): $stack")
        }

        instructions.forEach { instruction ->
            println("- $instruction")
        }

        assertEquals(3, stacks.size)
        assertEquals(4, instructions.size)

        Crane.execute(stacks, instructions)

        stacks.forEachIndexed { index, stack ->
            println("($index): $stack")
        }

        val result = stacks.onlyTops()
        println(result)
        assertEquals("CMZ", result)
    }
}