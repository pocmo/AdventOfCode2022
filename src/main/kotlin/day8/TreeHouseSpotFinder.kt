import day8.Tree
import day8.TreeVisitor

class TreeHouseSpotFinder : TreeVisitor {
    private val candidates = mutableMapOf<Tree, MutableList<Int>>()
    private var previous = mutableListOf<Int>()

    override fun visit(tree: Tree) {
        val visibleTrees = visibleTrees(tree.height)

        val distances = candidates.getOrPut(tree) { mutableListOf() }
        distances.add(visibleTrees)

        previous.add(tree.height)
    }

    override fun reset() {
        previous.clear()
    }

    private fun visibleTrees(height: Int): Int {
        var visible = 0
        previous.reversed().forEach { value ->
            if (value >= height) {
                return visible + 1
            } else {
                visible++
            }
        }
        return visible
    }

    fun getHighestScenicScore(): Int {
        return candidates.values.maxOfOrNull { values -> values.fold(1) { acc, value -> acc * value } }
            ?: error("No candidates :(")
    }
}