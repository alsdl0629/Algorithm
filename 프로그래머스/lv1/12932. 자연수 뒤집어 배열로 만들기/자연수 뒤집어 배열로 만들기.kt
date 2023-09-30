class Solution {
    fun solution(n: Long): IntArray {
        var answer: IntArray = n.toString().toMutableList().map { 
            it.digitToInt()
        }.toIntArray()
        return answer.reversedArray()
    }
}