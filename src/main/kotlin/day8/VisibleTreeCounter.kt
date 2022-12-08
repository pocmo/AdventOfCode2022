package day8

class VisibleTreeCounter : TreeVisitor {
    private val visibleTrees = mutableSetOf<Tree>()
    private var currentHeight = -1

    override fun visit(tree: Tree) {
        if (tree.height > currentHeight) {
            visibleTrees.add(tree)
            currentHeight = tree.height
        }
    }

    override fun reset() {
        currentHeight = -1
    }

    val count: Int get() = visibleTrees.size
}