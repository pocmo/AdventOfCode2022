package day8

import java.io.File

object TreeReader {
    fun parse(file: File): Forrest {
        val lines = file.readLines()
        val height = lines.size
        val width = lines[0].length

        val forrest = Forrest(width, height)

        file.readLines().forEachIndexed { y, line ->
            line.toCharArray().forEachIndexed { x, height ->
                val tree = Tree(x, y, height.digitToInt())
                forrest.add(tree)
            }
        }

        return forrest
    }
}
