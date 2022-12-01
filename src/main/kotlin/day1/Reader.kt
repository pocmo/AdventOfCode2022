package day1

import java.io.File

class Reader {
    fun readFile(file: File): List<Elf> {
        val elves = mutableListOf<Elf>()
        var calories = mutableListOf<Int>()
        file.readText().lineSequence().forEach { line ->
            if (line.isEmpty()) {
                elves.add(Elf(calories))
                calories = mutableListOf()
            } else {
                calories.add(line.toInt())
            }
        }
        if (calories.isNotEmpty()) {
            // If there's no trailing empty line...
            elves.add(Elf(calories))
        }
        return elves
    }
}
