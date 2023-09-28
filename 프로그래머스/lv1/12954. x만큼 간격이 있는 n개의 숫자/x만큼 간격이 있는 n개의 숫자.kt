class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        for (i in 1..n) {
            answer += (x.toLong() * i.toLong())
        }
        return answer
    }
}