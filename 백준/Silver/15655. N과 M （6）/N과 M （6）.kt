private val sb = StringBuilder()
private var n = 0
private var m = 0
private lateinit var numbers: IntArray
private lateinit var tmp: IntArray
fun main() = with(System.`in`.bufferedReader()) {
    readLine().split(" ").apply {
        n = this[0].toInt()
        m = this[1].toInt()
    }
    tmp = IntArray(m)
    numbers = readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
    dfs(0, 0)
    println(sb)
}
fun dfs(depth: Int, at: Int) {
    if (depth == m) {
        tmp.forEach { sb.append("$it ") }
        sb.append("\n")
    } else {
        for (i in at until n) {
            tmp[depth] = numbers[i]
            dfs(depth + 1, i + 1)
        }
    }
}