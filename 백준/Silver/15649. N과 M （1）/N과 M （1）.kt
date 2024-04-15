private lateinit var visited: BooleanArray
fun dfs(step: Int, n: Int, m: Int, s: String) {
    if (step == m) {
        println(s.trim())
    }
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

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    visited = BooleanArray(n)
    dfs(0, n, m, "")
}