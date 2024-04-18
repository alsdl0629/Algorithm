import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = IntArray(n)
    for (i in 0 until n) numbers[i] = readLine().toInt()
    numbers.sort()
    var start = 0
    var end = 0
    var minDiff = Int.MAX_VALUE

    while (true) {
        if (end == n) break
        val total = numbers[end] - numbers[start]
        if (total >= m) {
            if (total == m) {
                minDiff = m
                break
            }
            minDiff = minOf(minDiff, total)
            start++
        } else end++
    }

    bw.let {
        it.write("$minDiff")
        it.flush()
        it.close()
    }
}