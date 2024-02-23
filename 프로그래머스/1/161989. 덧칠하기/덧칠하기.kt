class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 0
        var end = 0
        section.forEach {
            if (it > end) {
                end = it + m - 1
                answer++
            }
        }
        return answer
    }
}