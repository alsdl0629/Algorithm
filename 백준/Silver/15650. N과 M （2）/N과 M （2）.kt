import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
private lateinit var numbers: IntArray
private val sb = StringBuilder()
fun dfs(at: Int, step: Int, n: Int, m: Int) {
    if (step == m) {
        for (i in numbers.indices) sb.append("${numbers[i]} ")
        sb.append("\n")
    } else {
        for (i in at .. n) {
            numbers[step] = i
            dfs(i + 1, step + 1, n, m)
        }
    }
}
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    numbers = IntArray(m)
    dfs(1, 0, n, m)
    println(sb)
}