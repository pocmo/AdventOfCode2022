package day3

import java.io.File

object RucksackReader {
    fun read(file: File): List<Rucksack> {
        val rucksacks = mutableListOf<Rucksack>()

        file.readLines().forEach { line ->
            if (line.isNotEmpty()) {
                rucksacks.add(
                    Rucksack(
                    first = line.substring(0, line.length / 2).toCharArray().asList(),
                    second = line.substring(line.length / 2).toCharArray().asList()
                ))
            }
        }

        return rucksacks
    }
}