class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        if (arr1.size > arr2.size) {
            answer = 1
        } else if (arr1.size < arr2.size) {
            answer = -1
        } else {
            var sum1 = arr1.reduce { acc, i -> acc + i }
            var sum2 = arr2.reduce { acc, i -> acc + i }
            if (sum1 > sum2) {
                answer = 1
            } else if (sum1 < sum2) {
                answer = -1
            } else {
                answer = 0
            }
        }
        return answer
    }
}