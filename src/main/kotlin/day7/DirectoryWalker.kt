package day7

object DirectoryWalker {
    fun traverse(directory: Directory, visitor: Visitor) {
        if (!directory.isRoot) {
            visitor.visitDirectory(directory)
        }

        directory.nodes.forEach { node ->
            when (node) {
                is Directory -> {
                    traverse(node, visitor)
                }
                is File -> Unit
            }
        }
    }
}

interface Visitor {
    fun visitDirectory(directory: Directory)
}
