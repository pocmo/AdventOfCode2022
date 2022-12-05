package day5

fun List<Stack>.onlyTops(): String {
    return map { stack -> stack.last() }
        .joinToString(separator = "")
}