class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        var nk = k
        tangerine.groupBy { it }.toList().sortedByDescending { it.second.size }.forEach {
            if (nk <= 0) return answer
            nk -= it.second.size
            answer++
        }
        return answer
    }
}