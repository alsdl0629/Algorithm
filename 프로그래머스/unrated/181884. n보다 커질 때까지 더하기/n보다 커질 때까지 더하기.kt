class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        numbers.forEach { 
            if (answer > n) {
                return answer
            }
            answer += it
        }
        return answer
    }
}