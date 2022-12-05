package day5

import java.io.File

object CrateAndInstructionReader {
    fun read(file: File): Pair<List<Stack>, List<Instruction>> {
        val stacks = mutableListOf<Stack>()
        val instructions = mutableListOf<Instruction>()

        var readCrates = true
        var readInstructions = false

        file.readLines().forEach { line ->
            if (!line.contains("[")) {
                readCrates = false
            }

            if (readCrates) {
                val crates = parseCrates(line)
                crates.forEachIndexed { index, crate ->
                    val stack = stacks.getOrGrow(index) { mutableListOf() }
                    if (crate != null) {
                        stack.add(0, crate)
                    }
                }
            }

            if (line.isEmpty()) {
                readInstructions = true
            } else if (readInstructions) {
                instructions.add(parseInstruction(line))
            }
        }

        return Pair(stacks, instructions)
    }

    private fun parseCrates(line: String): List<Crate?> {
        return line.windowed(3, step = 4, partialWindows = true).map { chunk ->
            if (chunk.isEmpty()) {
                null
            } else {
                chunk[1].takeIf { it.isLetter() }
            }
        }
    }

    private fun parseInstruction(line: String): Instruction {
        INSTRUCTION_REGEX.matchEntire(line)?.let { result ->
            return Instruction(
                amount = result.groups[1]!!.value.toInt(),
                from =  result.groups[2]!!.value.toInt(),
                to = result.groups[3]!!.value.toInt(),
            )
        } ?: error("Can't match: $line")
    }
}

private val INSTRUCTION_REGEX = "move (\\d+) from (\\d+) to (\\d+)".toRegex()

private fun <T> MutableList<T>.getOrGrow(index: Int, init: () -> T): T {
    while (size <= index) {
        add(init())
    }
    return get(index)
}
