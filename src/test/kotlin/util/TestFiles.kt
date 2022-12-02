package util

import java.io.File

object TestFiles {
    fun readTestFile(name: String): File {
        val classLoader = javaClass.classLoader
        return File(classLoader.getResource(name)?.file ?: error("Not found: $name"))
    }
}