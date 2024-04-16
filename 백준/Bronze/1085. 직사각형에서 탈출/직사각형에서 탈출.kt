fun main() = with(System.`in`.bufferedReader()) {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }
    val xMin = minOf(w - x, x - 0)
    val yMin = minOf(h - y, y - 0)
    println(minOf(xMin, yMin))
}