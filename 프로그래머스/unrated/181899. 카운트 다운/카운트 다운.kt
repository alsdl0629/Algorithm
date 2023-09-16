class Solution {
    fun solution(start: Int, end_num: Int): IntArray {
        var answer = mutableListOf<Int>()
        var a = start
        while (a >= end_num) {
            answer += a
            a--
        }
        return answer.toIntArray()
    }
}