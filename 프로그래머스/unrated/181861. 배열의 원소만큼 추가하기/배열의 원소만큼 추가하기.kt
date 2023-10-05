class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in arr.indices) for (j in 1..arr[i]) answer += arr[i]
        return answer
    }
}