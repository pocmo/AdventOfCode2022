package day8

object ForrestWalker {
    fun walk(forrest: Forrest, visitor: TreeVisitor) {
        walkFromWest(forrest, visitor)
        walkFromEast(forrest, visitor)
        walkFromNorth(forrest, visitor)
        walkFromSouth(forrest, visitor)
    }

    private fun walkFromWest(forrest: Forrest, visitor: TreeVisitor) {
        for (y in 0 until forrest.height) {
            for (x in 0 until forrest.width) {
                visitor.visit(forrest.get(x, y))
            }
            visitor.reset()
        }
    }

    private fun walkFromEast(forrest: Forrest, visitor: TreeVisitor) {
        for (y in 0 until forrest.height) {
            for (x in forrest.width - 1 downTo  0) {
                visitor.visit(forrest.get(x, y))
            }
            visitor.reset()
        }
    }

    private fun walkFromNorth(forrest: Forrest, visitor: TreeVisitor) {
        for (x in 0 until forrest.width) {
            for (y in 0 until forrest.height) {
                visitor.visit(forrest.get(x, y))
            }
            visitor.reset()
        }
    }

    private fun walkFromSouth(forrest: Forrest, visitor: TreeVisitor) {
        for (x in 0 until forrest.width) {
            for (y in forrest.height - 1 downTo 0) {
                visitor.visit(forrest.get(x, y))
            }
            visitor.reset()
        }
    }
}

interface TreeVisitor {
    fun visit(tree: Tree)

    fun reset()
}