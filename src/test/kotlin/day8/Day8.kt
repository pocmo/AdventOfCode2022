package day8

import TreeHouseSpotFinder
import org.junit.jupiter.api.Test
import util.TestFiles
import kotlin.test.assertEquals

class Day8 {
    @Test
    fun example() {
        val file = TestFiles.readTestFile("day8/example.txt")
        val forrest = TreeReader.parse(file)

        val counter = VisibleTreeCounter()
        ForrestWalker.walk(forrest, counter)

        assertEquals(21, counter.count)
    }

    @Test
    fun examplePuzzle2() {
        val file = TestFiles.readTestFile("day8/example.txt")
        val forrest = TreeReader.parse(file)

        val treeHouseFinder = TreeHouseSpotFinder()
        ForrestWalker.walk(forrest, treeHouseFinder)

        assertEquals(8, treeHouseFinder.getHighestScenicScore())
    }

    @Test
    fun puzzle1() {
        val file = TestFiles.readTestFile("day8/input1.txt")
        val forrest = TreeReader.parse(file)

        val counter = VisibleTreeCounter()
        ForrestWalker.walk(forrest, counter)

        val count = counter.count
        println("Result: $count")
        assertEquals(1662, counter.count)
    }

    @Test
    fun puzzle2() {
        val file = TestFiles.readTestFile("day8/input1.txt")
        val forrest = TreeReader.parse(file)

        val treeHouseFinder = TreeHouseSpotFinder()
        ForrestWalker.walk(forrest, treeHouseFinder)

        val result = treeHouseFinder.getHighestScenicScore()
        println("Result = $result")
        //assertEquals(8, result)
    }
}