import kotlin.math.max
class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = IntArray(2)
        for (i in 1..max(n, m)) {
            if (n % i == 0 && m % i == 0) answer[0] = i
        }
        var a = n / answer[0]
        var b = m / answer[0]
        answer[1] = answer[0] * a * b
        return answer
    }
}