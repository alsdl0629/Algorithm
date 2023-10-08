class Solution {
    fun solution(arr: IntArray, delete_list: IntArray) = arr.filter { it !in delete_list }.toIntArray()
}