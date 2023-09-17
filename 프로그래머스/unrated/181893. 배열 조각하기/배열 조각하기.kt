class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr
    for ((i, value) in query.withIndex()) {
        if (i % 2 == 0) {
            answer = answer.take(value + 1).toIntArray()
        } else {
            answer = answer.drop(value).toIntArray()
        }
    }
    return answer
    }
}