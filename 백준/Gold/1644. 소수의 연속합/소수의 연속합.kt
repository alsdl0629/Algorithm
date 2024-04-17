import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var end = 2
    var total = 0
    var count = 0

    for (start in 2 .. n) {
        if (isPrime(start)) {
            while (n > total) {
                if (isPrime(end)) {
                    total += end
                    end++
                } else end++
            }
            if (n == total) count++
            total -= start
        }
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