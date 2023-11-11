class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        absolutes.mapIndexed { index, i ->
            if (signs[index]) answer += i
            else answer += i * -1
        }
        return answer
    }
}