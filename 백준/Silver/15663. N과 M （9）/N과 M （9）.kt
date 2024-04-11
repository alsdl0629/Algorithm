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
    visited = BooleanArray(n) { false }
    dfs(0)
    println(sb)
}
fun dfs(depth: Int) {
    if (depth == m) {
        val tmpSb = StringBuilder()
        tmp.forEach { tmpSb.append("$it ") }

        if (!checkDuplication.contains(tmpSb.toString())) {
            sb.append(tmpSb)
            sb.append("\n")
            checkDuplication.add(tmpSb.toString())
        }
    } else {
        for (i in numbers.indices) {
            if (!visited[i]) {
                visited[i] = true
                tmp[depth] = numbers[i]
                dfs(depth + 1)
                visited[i] = false
            }
        }
    }
}