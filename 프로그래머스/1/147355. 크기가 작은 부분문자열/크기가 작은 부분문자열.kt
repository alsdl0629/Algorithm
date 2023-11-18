class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val pLength = p.length
        var i = 0
        while (t.length + 1 != i + pLength) {
            var s = t.substring(i..i + pLength - 1)
            if (s.toLong() <= p.toLong()) answer++
            i++
        }
        return answer
    }
}