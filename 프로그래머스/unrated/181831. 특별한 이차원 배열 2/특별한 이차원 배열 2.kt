class Solution {
    fun solution(arr: Array<IntArray>): Int {
    var answer: Int = 0
    var result = true
    arr.forEachIndexed { idx1, ints ->
        ints.forEachIndexed { idx2, i ->
            if (arr[idx1][idx2] != arr[idx2][idx1]) result = false
        }
    }
    return if (result) 1 else 0
}
}