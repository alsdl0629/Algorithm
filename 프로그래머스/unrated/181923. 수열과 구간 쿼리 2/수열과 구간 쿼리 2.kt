class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
    for ((i, row) in queries.withIndex()) {
        var arr1 = intArrayOf()
        for (j in row[0]..row[1]) if (arr[j] > row[2]) arr1 += arr[j]
        answer += arr1.minOrNull() ?: -1
    }
    return answer
    }
}