package day7

interface Node {
    val name: String
    val size: Long
}

data class Directory(
    override val name: String,
    val parent: Directory?
) : Node {
    private val content: MutableList<Node> = mutableListOf()

    val nodes: List<Node> get() = content

    val directories: List<Directory> get() = content.mapNotNull { node -> node as? Directory }

    fun add(node: Node) {
        content.add(node)
    }

    val isRoot: Boolean = name == "/"

    override val size: Long
        get() = content.sumOf { node -> node.size }
}

class File(
    override val name: String,
    override val size: Long
): Node
