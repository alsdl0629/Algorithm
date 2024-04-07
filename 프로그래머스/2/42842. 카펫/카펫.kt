class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf(0, 0)
        val sum = brown + yellow

        for (i in 3..sum) {
            val other = sum / i
            if (sum % i == 0 && other >= 3) {
                val x = maxOf(i, other)
                val y = minOf(i, other)

                if ((x - 2) * (y - 2) == yellow) {
                    answer[0] = x
                    answer[1] = y
                    return answer
                }
            }
        }

        return answer
    }
}