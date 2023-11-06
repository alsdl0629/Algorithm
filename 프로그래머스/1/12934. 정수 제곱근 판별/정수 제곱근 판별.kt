import kotlin.math.sqrt
class Solution {
    fun solution(n: Long): Long {
        val sqrt = sqrt(n.toDouble())
        return if (sqrt - sqrt.toInt() == 0.toDouble()) {
            (sqrt.toLong() + 1) * (sqrt.toLong() + 1)
        } else {
            -1
        }
    }
}