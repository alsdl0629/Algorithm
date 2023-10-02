class Solution {
    fun solution(arr: IntArray, idx: Int) = arr.indices.find { it >= idx && arr[it] == 1 } ?: -1
}