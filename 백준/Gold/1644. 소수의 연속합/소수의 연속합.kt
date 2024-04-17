import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var start = 0
    var end = 0
    var total = 0
    var count = 0
    val arr = mutableListOf<Int>()
    for (i in 2..n) {
        if (isPrime(i)) arr += i
    }

    val size = arr.size
    while (true) {
        if (total >= n) { // 누적합이 n보다 클 때
            if (total == n) count++ // 누적합이 n과 같을 때
            total -= arr[start++]
        } else if (end == size) break
        else total += arr[end++] // 누적합이 n보다 작을 때
    }

    bw.let {
        it.write("$count")
        it.flush()
    }
}

private fun isPrime(n: Int): Boolean {
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}