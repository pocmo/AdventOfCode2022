package day7

object TerminalOutputReader {
    fun parse(file: java.io.File): Directory {
        var current = Directory("dummy", parent = null)
        val root = Directory("/", parent = null)
        current.add(root)

        file.readLines().forEach { line ->
            when {
                line == "$ cd .." -> {
                    current = current.parent!!
                }
                line.startsWith("$ cd ") -> {
                    val subDirectoryName = line.substring(5)
                    current = current.directories.find { node -> node.name == subDirectoryName }
                        ?: error("Could not find sub directory: $subDirectoryName")
                }
                line.startsWith("dir ") -> {
                    current.add(Directory(
                        name = line.substring(4),
                        parent = current
                    ))
                }
                line.first().isDigit() -> {
                    val (size, name) = line.split(" ")
                    current.add(File(name, size.toLong()))
                }
                line == "$ ls" -> Unit
                else -> error("Can't parse: $line")
            }
        }

        return root
    }
}