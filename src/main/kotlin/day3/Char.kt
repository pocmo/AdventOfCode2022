package day3

private val priorityLookup = (('a' .. 'z') + ('A' .. 'Z'))
    .toList()
    .mapIndexed { index, char -> Pair(char, index + 1) }
    .toMap()

fun Char.priority(): Int {
    return priorityLookup[this] ?: error("Unknown character: $this")
}