private lateinit var visited: BooleanArray
private val sb = StringBuilder()
fun main() = with(System.`in`.bufferedReader()) {
    var n = 0
    var m = 0
    readln().split(" ").apply {
        n = this[0].toInt()
        m = this[1].toInt()
    }
    visited = BooleanArray(n)
    dfs(0, n, m, "")
    println(sb)
}


private fun dfs(step: Int, n: Int, m: Int, s: String) {
    if (step == m) sb.append(s.trim()).append("\n")
    else {
        for (i in 1.. n) {
            if (!visited[i - 1]) {
                visited[i - 1] = true
                dfs(step + 1, n, m, "$s $i")
                visited[i - 1] = false
            }
        }
    }
}