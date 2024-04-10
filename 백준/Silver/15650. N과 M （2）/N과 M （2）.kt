private lateinit var numbers: IntArray
fun dfs(at: Int, step: Int, n: Int, m: Int) {
    if (step == m) {
        for (i in numbers.indices) print("${numbers[i]} ")
        println()
    } else {
        for (i in at .. n) {
            numbers[step] = i
            dfs(i + 1, step + 1, n, m)
        }
    }
}
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    numbers = IntArray(m)
    dfs(1, 0, n, m)
}