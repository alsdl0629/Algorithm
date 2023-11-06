class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        n.toString().map {
            answer += it.digitToInt()
        }
        return answer
    }
}