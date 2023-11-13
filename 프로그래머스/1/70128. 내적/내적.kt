class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        a.mapIndexed { index, i -> 
            answer += i * b[index]
        }
        return answer
    }
}