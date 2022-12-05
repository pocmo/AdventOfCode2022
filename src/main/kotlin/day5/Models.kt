package day5

typealias Crate = Char
typealias Stack = MutableList<Crate>

data class Instruction(
    val amount: Int,
    val from: Int,
    val to: Int
)
