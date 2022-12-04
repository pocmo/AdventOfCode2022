package day4

import java.io.File

typealias Elf = IntRange
typealias ElfPair = Pair<Elf, Elf>

object ElfPairReader {
    fun read(file: File): List<ElfPair> {
        return file.readLines()
            .filter { line -> line.isNotEmpty() }
            .map { line -> parseElfPair(line) }
    }
}

private fun parseElfPair(line: String): ElfPair {
    val (one, two) = line.split(",")
    return Pair(
        parseElf(one),
        parseElf(two)
    )
}

private fun parseElf(raw: String): Elf {
    val (start, end) = raw.split("-")
    return IntRange(start.toInt(), end.toInt())
}
