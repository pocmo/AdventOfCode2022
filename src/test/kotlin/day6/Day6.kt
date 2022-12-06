package day6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import util.TestFiles

class Day6 {
    @Test
    fun example1() {
        val file = TestFiles.readTestFile("day6/example1.txt")
        val reader = SignalReader(file)

        val markerPosition = reader.findMarker(markerSize = 4)
        assertEquals(7, markerPosition)

        val messagePosition = reader.findMarker(markerSize = 14)
        assertEquals(19, messagePosition)
    }

    @Test
    fun example2() {
        val file = TestFiles.readTestFile("day6/example2.txt")
        val reader = SignalReader(file)

        val markerPosition = reader.findMarker(markerSize = 4)
        assertEquals(5, markerPosition)

        val messagePosition = reader.findMarker(markerSize = 14)
        assertEquals(23, messagePosition)
    }

    @Test
    fun example3() {
        val file = TestFiles.readTestFile("day6/example3.txt")
        val reader = SignalReader(file)

        val markerPosition = reader.findMarker(markerSize = 4)
        assertEquals(6, markerPosition)

        val messagePosition = reader.findMarker(markerSize = 14)
        assertEquals(23, messagePosition)
    }

    @Test
    fun example4() {
        val file = TestFiles.readTestFile("day6/example4.txt")
        val reader = SignalReader(file)

        val markerPosition = reader.findMarker(markerSize = 4)
        assertEquals(10, markerPosition)

        val messagePosition = reader.findMarker(markerSize = 14)
        assertEquals(29, messagePosition)
    }

    @Test
    fun example5() {
        val file = TestFiles.readTestFile("day6/example5.txt")
        val reader = SignalReader(file)

        val markerPosition = reader.findMarker(markerSize = 4)
        assertEquals(11, markerPosition)

        val messagePosition = reader.findMarker(markerSize = 14)
        assertEquals(26, messagePosition)
    }

    @Test
    fun puzzle1() {
        val file = TestFiles.readTestFile("day6/input1.txt")
        val reader = SignalReader(file)

        val markerPosition = reader.findMarker(markerSize = 4)
        println("Result: $markerPosition")
        assertEquals(1655, markerPosition)
    }

    @Test
    fun puzzle2() {
        val file = TestFiles.readTestFile("day6/input1.txt")
        val reader = SignalReader(file)

        val messagePosition = reader.findMarker(markerSize = 14)
        println("Result: $messagePosition")
        assertEquals(2665, messagePosition)
    }
}