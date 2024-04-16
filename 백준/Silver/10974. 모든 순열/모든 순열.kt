private var n = 0
private val sb = StringBuilder()
private lateinit var visited: BooleanArray
private lateinit var tmp: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    n = readln().toInt()
    visited = BooleanArray(n)
    tmp = IntArray(n)
    dfs(0)
    println(sb)
}

private fun dfs(depth: Int) {
    if (depth == n) {
        tmp.forEach { sb.append("$it ") }
        sb.append("\n")
    } else {
        for (i in 1..n) {
            if (!visited[i - 1]) {
                visited[i - 1] = true
                tmp[depth] = i
                dfs(depth + 1)
                visited[i - 1] = false
            }
        }
    }
}