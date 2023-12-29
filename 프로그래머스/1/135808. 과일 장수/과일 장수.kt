class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0
        val sorted = score.sortedDescending()
        var jump = 0

        for (i in 0 until sorted.size / m) {
            val min = sorted.slice(jump until jump + m).minOrNull()!!
            answer += min * m
            jump += m
        }

        return answer
    }
}