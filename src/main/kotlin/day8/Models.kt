package day8

data class Tree(
    val x: Int,
    val y: Int,
    val height: Int
)

class Forrest(
    val width: Int,
    val height: Int
) {
    private val values: MutableMap<Int, MutableMap<Int, Tree>> = mutableMapOf()

    fun add(tree: Tree) {
        val row = values.getOrPut(tree.y) { mutableMapOf() }
        row[tree.x] = tree
    }

    fun get(x: Int, y: Int): Tree {
        return values[y]?.get(x)
            ?: error("No tree at coordinate: $x / $y")
    }
}
