class Solution {
    fun solution(num_list: IntArray) = when {
        num_list.size > 10 -> num_list.sum()
        else -> num_list.fold(1) {total, num -> total * num}
    }
}