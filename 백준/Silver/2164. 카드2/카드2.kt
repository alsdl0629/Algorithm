fun main() {
    var DQ = ArrayDeque<Int>()
    val readln = readln()
    for (i in 1..readln.toInt()) DQ.addLast(i)
    for (i in 1..readln.toInt()) {
        if (DQ.size == 1) break
        DQ.removeFirst()
        val removeLast = DQ.removeFirst()
        DQ.addLast(removeLast)
    }
    println(DQ[0])
}