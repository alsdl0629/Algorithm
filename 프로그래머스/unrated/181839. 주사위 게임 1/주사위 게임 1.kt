import kotlin.math.abs
import kotlin.math.pow
class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
    if (a % 2 == 1 && b % 2 == 1) answer = ((a.toDouble().pow(2)) + (b.toDouble().pow(2))).toInt()
    else if (a % 2 == 1 || b % 2 == 1) answer = 2 * (a + b)
    else if (a % 2 == 0 && b % 2 == 0) answer = abs(a - b)
    return answer
    }
}