private val xList = intArrayOf(-1, 0, 1, 0)
private val yList = intArrayOf(0, 1, 0, -1)
private val Q = ArrayDeque<Pair<Int, Int>>()
private var n = 0
private var m = 0

fun main() = with(System.`in`.bufferedReader()) {
    readln().split(" ").apply {
        n = this[0].toInt()
        m = this[1].toInt()
    }
    
    val map = Array(m) { IntArray(n) }
    for (i in 0 until m) map[i] = readln().split(" ").mapIndexed { index, s ->
        if (s.toInt() == 1) Q.addFirst(Pair(i, index))
        s.toInt()
    }.toIntArray()

    if (map.all { it.all { element -> element == 1 } }) {
        println(0)
        return
    }

    while (Q.isNotEmpty()) {
        val v = Q.removeLast()
        val x = v.first
        val y = v.second

        for (i in 0 until 4) {
            val nx = x + xList[i]
            val ny = y + yList[i]
            if (nx >= 0 && ny >= 0 && nx < m && ny < n && map[nx][ny] == 0) {
                Q.addFirst(Pair(nx, ny))
                map[nx][ny] = map[x][y] + 1
            }
        }
    }

    if (map.any { it.any {element -> element == 0} }) println(-1)
    else println(map.maxOf { it.max() } - 1)
}