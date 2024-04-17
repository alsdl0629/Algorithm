import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }.toIntArray()
    var end = 0
    var total = 0
    var count = 0

    for (start in 0 until n) {
        while (m > total && n > end) {
            total += numbers[end]
            end++
        }
        if (total == m) count++
        total -= numbers[start]
    }
    bw.write("$count")
    bw.flush()
}