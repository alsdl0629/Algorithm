class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
    for (index in included.indices) {
        if (included[index]) {
            var b = index
            answer += a + (b * d)
        }
    }
    return answer
    }
}