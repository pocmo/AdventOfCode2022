package day7

import org.junit.jupiter.api.Test
import util.TestFiles
import kotlin.test.assertEquals

class Day7 {
    @Test
    fun example() {
        val file = TestFiles.readTestFile("day7/example.txt")
        val root = TerminalOutputReader.parse(file)

        val visitor = SizeVisitor()
        DirectoryWalker.traverse(root, visitor)

        assertEquals(95437, visitor.sum)
    }

    @Test
    fun puzzle1() {
        val file = TestFiles.readTestFile("day7/input1.txt")
        val root = TerminalOutputReader.parse(file)

        val visitor = SizeVisitor()
        DirectoryWalker.traverse(root, visitor)

        println("Result: ${visitor.sum}")
        assertEquals(1348005, visitor.sum)
    }

    @Test
    fun puzzle2() {
        val file = TestFiles.readTestFile("day7/input1.txt")
        val root = TerminalOutputReader.parse(file)

        val visitor = DeleteVisitor(
            usedSpace = root.size
        )
        DirectoryWalker.traverse(root, visitor)

        val result = visitor.smallestDirectoryToDelete().size
        println("Result: $result")
        assertEquals(12785886, result)
    }
}