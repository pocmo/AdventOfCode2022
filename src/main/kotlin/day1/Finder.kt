package day1


fun List<Elf>.findMostCaloriesIndex(): Int {
    return indices.maxBy { i -> get(i).sum }
}

fun List<Elf>.findMostCaloriesElfNumber(): Int {
    return findMostCaloriesIndex() + 1 // :P
}

fun List<Elf>.findMostCaloriesByElf(): Int {
    return maxBy{ elf -> elf.sum }.sum
}

fun List<Elf>.sumOfTopThree(): Int {
    return sortedByDescending { elf -> elf.sum }
        .take(3)
        .sumOf { elf -> elf.sum }
}
