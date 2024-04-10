import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
private var n = 0
private var m = 0
private val sb = StringBuilder()
private lateinit var numbers: IntArray
fun dfs(depth: Int) {
    if (depth == m) {
        for (i in numbers.indices) sb.append("${numbers[i]} ")
        sb.append("\n")
    } else {
        for (i in 1..n) {
            numbers[depth] = i
            dfs(depth + 1)
        }
    }
}
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()
    numbers = IntArray(m)
    dfs(0)
    println(sb)
}