class Solution {
    fun solution(num_list: IntArray)= if (num_list.reduce {acc, i ->  acc * i} > num_list.sum() * num_list.sum()) 0 else 1
}