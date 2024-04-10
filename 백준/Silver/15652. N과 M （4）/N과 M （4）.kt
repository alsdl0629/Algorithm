import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
private var n = 0
private var m = 0
private val sb = StringBuilder()
private lateinit var numbers: IntArray
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()
    numbers = IntArray(m)
    dfs(0, 1)
    println(sb)
}
fun dfs(depth: Int, at: Int) {
    if (depth == m) {
        numbers.forEach { sb.append("$it ") }
        sb.append("\n")
    } else {
        for (i in at..n) {
            numbers[depth] = i
            dfs(depth + 1, i)
        }
    }
}