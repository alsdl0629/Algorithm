private lateinit var visited: BooleanArray
private lateinit var numbers: IntArray

fun dfs(step: Int, n: Int, m: Int) {
    if (step == m) {
        for (i in numbers.indices) print("${numbers[i]} ")
        println()
    }
    else {
        for (i in 0 until n) {
            if (!visited[i]) {
                visited[i] = true
                numbers[step] = i + 1
                dfs(step + 1, n, m)
                visited[i] = false
            }
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    visited = BooleanArray(n)
    numbers = IntArray(m)
    dfs(0, n, m)
}