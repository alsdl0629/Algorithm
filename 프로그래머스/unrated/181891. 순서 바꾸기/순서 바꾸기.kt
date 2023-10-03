class Solution {
    fun solution(num_list: IntArray, n: Int) = (num_list.slice(n..num_list.lastIndex) + num_list.slice(0..n-1)).toIntArray()
}