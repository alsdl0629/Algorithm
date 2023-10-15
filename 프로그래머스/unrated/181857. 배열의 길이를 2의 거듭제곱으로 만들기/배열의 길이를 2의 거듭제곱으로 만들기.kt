class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr
        var involution = 1
        while (answer.size > involution) involution *= 2
        if (answer.size != 1)  while (answer.size != involution) answer += 0
        return answer
    }
}