fun main() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val map = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        val inputList = readln().split("")
        for (j in 0 until n) map[i][j] = inputList[j + 1].toInt()
    }

    val xList = intArrayOf(-1, 0, 1, 0)
    val yList = intArrayOf(0, 1, 0, -1)

    var total = 0
    val eachTotalList = mutableListOf<Int>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (map[i][j] == 1) {
                var eachTotal = 0
                val Q = ArrayDeque<Pair<Int, Int>>()
                Q.addFirst(Pair(i, j))

                while (Q.isNotEmpty()) {
                    val v = Q.removeLast()
                    val x = v.first
                    val y = v.second

                    for (k in 0 until 4) {
                        val nx = x + xList[k]
                        val ny = y + yList[k]

                        if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 1) {
                            map[nx][ny] = 0
                            Q.addFirst(Pair(nx, ny))
                            eachTotal++
                        }
                    }
                }
                total++
                eachTotalList += if (eachTotal == 0) 1 else eachTotal

            }
        }
    }
    val sb = StringBuilder().append(total).append("\n")
    eachTotalList.sorted().forEach { sb.append(it).append("\n") }
    println(sb)
}