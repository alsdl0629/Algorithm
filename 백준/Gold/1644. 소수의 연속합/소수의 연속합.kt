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
    val arr = getPrimeNumbers(n)
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

private fun getPrimeNumbers(n: Int): List<Int> {
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    val sqrt = sqrt(n.toDouble()).toInt()

    for (i in 2..sqrt) {
        if (isPrime[i]) for (j in i * i..n step i) isPrime[j] = false
    }

    return isPrime.indices.filter { isPrime[it] }
}