package day7

class SizeVisitor : Visitor {
    var sum: Long = 0
        private set

    override fun visitDirectory(directory: Directory) {
        val size = directory.size
        if (size <= 100000) {
            sum += size
        }
    }


}