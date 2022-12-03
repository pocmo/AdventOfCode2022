package day3

fun List<Rucksack>.sumOfPriorities(): Int {
    return sumOf { rucksack -> rucksack.itemInBoth().priority() }
}

fun List<Rucksack>.sumBadgePrioritiesChunked(): Int {
    return chunked(3).sumOf { chunk ->
        chunk.sumBadgePriorities()
    }
}

fun List<Rucksack>.sumBadgePriorities(): Int {
    return findBadges()
        .sumOf { badge -> badge.priority() }
}

fun List<Rucksack>.findBadges(): List<Char> {
    return map { rucksack -> rucksack.distinctItems() }
        .flatten()
        .groupingBy { item -> item }
        .eachCount()
        .filter { (_, count) -> count == 3 }
        .keys
        .toList()
}