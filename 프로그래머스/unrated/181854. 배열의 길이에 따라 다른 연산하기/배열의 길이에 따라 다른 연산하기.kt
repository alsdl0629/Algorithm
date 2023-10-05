class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
    if (arr.size % 2 == 0) {
        for (i in 0..arr.lastIndex) {
            if (i % 2 == 1) answer += arr[i] + n
            else answer += arr[i]
        }
    } else {
        for (i in 0..arr.lastIndex) {
            if (i % 2 == 0) answer += arr[i] + n
            else answer += arr[i]
        }
    }
    return answer
    }
}