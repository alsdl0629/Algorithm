import java.io.BufferedReader
import java.io.InputStreamReader
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val token = readLine().toInt()
    var sum = 0
    for (i in 1..token) {
        sum += i
    }
    println(sum)
}