class Solution {
    fun solution(num_list: IntArray) =  num_list.sorted().slice(5..num_list.lastIndex)
}