class Solution {
    fun solution(num_list: IntArray): Int = num_list.partition { it % 2 == 0 }.toList().sumOf { it.joinToString("").toInt() }
}