package day7

class DeleteVisitor(
    val totalDiskSpace: Long = 70000000,
    val spacedNeeded: Long = 30000000,
    val usedSpace: Long
) : Visitor {
    val unusedSpace = totalDiskSpace - usedSpace
    val deleteSize = spacedNeeded - unusedSpace

    var candidates = mutableListOf<Directory>()

    override fun visitDirectory(directory: Directory) {
        if (directory.size >= deleteSize) {
            candidates.add(directory)
        }
    }

    fun smallestDirectoryToDelete(): Directory {
        return candidates.minBy { directory -> directory.size }
    }
}