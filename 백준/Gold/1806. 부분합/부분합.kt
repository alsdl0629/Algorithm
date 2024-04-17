import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, s) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }.toIntArray()
    var start = 0
    var end = 0
    var total = 0
    val arr = mutableListOf<Int>() // 길이 저장

    while (true) {
        if (total >= s) {
            arr.add(end - start)
            total -= numbers[start++]
        } else if (end == n) break
        else {
            total += numbers[end]
            end++
        }
    }

    val min = if (arr.isEmpty()) 0 else arr.minOf { it }
    bw.run {
        write("$min")
        flush()
    }
}