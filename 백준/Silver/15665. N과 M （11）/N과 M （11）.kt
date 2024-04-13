private val sb = StringBuilder()
private var n = 0
private var m = 0
private lateinit var numbers: IntArray
private lateinit var tmp: IntArray
private val checkDuplication = mutableSetOf<String>()
fun main() = with(System.`in`.bufferedReader()) {
    readLine().split(" ").apply {
        n = this[0].toInt()
        m = this[1].toInt()
    }
    numbers = readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
    tmp = IntArray(m)
    dfs(0)
    println(sb)
}
fun dfs(depth: Int) {
    if (depth == m) {
        val tmpSb = StringBuilder()
        tmp.forEach { tmpSb.append("$it ") }
        if (!checkDuplication.contains(tmpSb.toString())) {
            checkDuplication.add(tmpSb.toString())
            sb.append(tmpSb).append("\n")
        }
    } else {
        numbers.forEach {
            tmp[depth] = it
            dfs(depth + 1)
        }
    }
}