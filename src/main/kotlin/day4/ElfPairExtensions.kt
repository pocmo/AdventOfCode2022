package day4

fun ElfPair.containsEachOther(): Boolean =
    first.contains(second) || second.contains(first)

fun Elf.contains(other: Elf): Boolean =
    first <= other.first && last >= other.last

fun List<ElfPair>.countPairsContainingEachOther(): Int =
    count { pair -> pair.containsEachOther() }

fun ElfPair.overlaps(): Boolean {
    // One direction should be enough for overlap.
    return first.overlaps(second)
}

fun Elf.overlaps(other: Elf): Boolean {
    return if (first < other.first) {
        // First is before "other": End needs to be *after* first of "other" to have overlap.
        last >= other.first
    } else
        // Else: Only if first is inside "other" then it's overlapping.
        first <= other.last
}

fun List<ElfPair>.countOverlappingPairs(): Int =
    count { pair -> pair.overlaps() }