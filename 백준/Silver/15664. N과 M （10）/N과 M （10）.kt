private val sb = StringBuilder()
private var n = 0
private var m = 0
private lateinit var numbers: IntArray
private lateinit var tmp: IntArray
private lateinit var visited: BooleanArray
private val checkDuplication = hashSetOf<String>()
fun main() = with(System.`in`.bufferedReader()) {
    readLine().split(" ").apply {
        n = this[0].toInt()
        m = this[1].toInt()
    }
    numbers = readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
    tmp = IntArray(m)
    visited = BooleanArray(n)
    dfs(0, 0)
    println(sb)
}
fun dfs(depth: Int, at: Int) {
    if (depth == m) {
        val tmpSb = StringBuilder()
        tmp.forEach { tmpSb.append("$it ") }

        if (!checkDuplication.contains(tmpSb.toString())) {
            checkDuplication.add(tmpSb.toString())
            sb.append(tmpSb)
            sb.append("\n")
        }
    } else {
        for (i in at until n) {
            if (!visited[i]) {
                visited[i] = true
                tmp[depth] = numbers[i]
                dfs(depth + 1, i)
                visited[i] = false
            }
        }
    }
}