import kotlin.math.max
class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var gcm = gcm(n, m)
        return intArrayOf(gcm, (n * m) / gcm)
    }

    tailrec fun gcm(a: Int, b: Int): Int {
        return if (b == 0) a else gcm(b, a % b)
    }
}