package day5

object Crane {
    fun execute(stacks: List<Stack>, instructions: List<Instruction>) {
        instructions.forEach { instruction ->
            val source = stacks[instruction.from - 1]
            val target = stacks[instruction.to - 1]

            repeat(instruction.amount) {
                val crate = source.removeLast()
                target.add(crate)
            }
        }
    }

    fun executeOptimized(stacks: List<Stack>, instructions: List<Instruction>) {
        instructions.forEach { instruction ->
            val source = stacks[instruction.from - 1]
            val target = stacks[instruction.to - 1]

            val crates = source.takeLast(instruction.amount)
            repeat(instruction.amount) { source.removeLast() }

            target.addAll(crates)
        }
    }
}
