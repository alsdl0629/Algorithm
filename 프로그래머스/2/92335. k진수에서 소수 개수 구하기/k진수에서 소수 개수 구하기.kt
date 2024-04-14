import kotlin.math.sqrt
class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        val nk = n.toString(k)
        nk.split("0").map {
            if (it.isNotEmpty()) {
                if (checkPrimeNumber(it.toLong())) answer++
            }
        }
        return answer
    }

    fun checkPrimeNumber(n: Long): Boolean {
        var cnt = 0
        for (i in 1..sqrt(n.toDouble()).toLong()) {
            if (n % i == 0L) {
                cnt++
                if (i * i != n) cnt++
            }
        }
        return cnt == 2
    }
}