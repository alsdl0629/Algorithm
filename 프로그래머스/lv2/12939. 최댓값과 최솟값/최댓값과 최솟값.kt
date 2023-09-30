class Solution {
    fun solution(s: String): String {
        var arr = mutableListOf<Int>()
        s.split(" ").map { arr += it.toInt() }
        var answer = mutableListOf<Int>()
        answer += arr.minOf { it }
        answer += arr.maxOf { it }
        return answer.joinToString(" ")
    }
}