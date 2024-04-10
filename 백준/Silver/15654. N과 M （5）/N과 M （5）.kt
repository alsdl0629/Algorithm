private val sb = StringBuilder()
private var n = 0
private var m = 0
private lateinit var numbers: IntArray
private lateinit var tmp: IntArray
private lateinit var visited: BooleanArray
fun main() = with(System.`in`.bufferedReader()) {
    readLine().split(" ").apply {
        n = this[0].toInt()
        m = this[1].toInt()
    }
    numbers = IntArray(n)
    numbers = readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
    tmp = IntArray(m)
    visited = BooleanArray(n)
    dfs(0)
    println(sb)
}
fun dfs(depth: Int) {
    if (depth == m) {
        tmp.forEach { sb.append("$it ") }
        sb.append("\n")
    } else {
        for (i in 0 until n) {
            if (!visited[i]) {
                visited[i] = true
                tmp[depth] = numbers[i]
                dfs(depth + 1)
                visited[i] = false
            }

        }
    }
}