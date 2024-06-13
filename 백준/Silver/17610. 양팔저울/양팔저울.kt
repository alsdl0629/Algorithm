private var sum = 0
private lateinit var scale: IntArray
private val box = mutableSetOf<Int>()

fun main() = with(System.`in`.bufferedReader()) {
    readLine().toInt()
    scale = readLine().split(" ").map { it.toInt() }.toIntArray()
    sum = scale.sum()

    dfs(0,0)

    var cnt = 0
    for (i in 1..sum) {
        if (!box.contains(i)) cnt++
    }
    println(cnt)
}

private fun dfs(idx: Int, total: Int) {
    if (idx >= scale.size) {
        if (total in 1..sum) box.add(total)
    } else {
        dfs(idx + 1, total + scale[idx])
        dfs(idx + 1, total)
        dfs(idx + 1, total - scale[idx])
    }
}