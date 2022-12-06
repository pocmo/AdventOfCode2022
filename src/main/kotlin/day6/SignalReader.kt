package day6

import java.io.BufferedReader
import java.io.File

class SignalReader(private val file: File) {

    fun findMarker(markerSize: Int): Int {
        val window = mutableListOf<Char>()
        var position = 0
        val signal = file.bufferedReader()

        while (true) {
            val character = signal.readCharacter() ?: error("Could not find marker")
            position++

            window.add(character)

            if (window.size > markerSize) {
                window.removeFirst()
            }

            if (window.distinct().size == markerSize) {
                return position
            }
        }
    }
}

private fun BufferedReader.readCharacter(): Char? {
    val value = read()
    return if (value == -1) {
        null
    } else {
        value.toChar()
    }
}

