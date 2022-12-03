package day3

data class Rucksack(
    val first: List<Char>,
    val second: List<Char>
) {
    fun itemInBoth(): Char {
        return first.intersect(second).first()
    }

    fun distinctItems(): List<Char> {
        return (first + second).distinct()
    }
}
