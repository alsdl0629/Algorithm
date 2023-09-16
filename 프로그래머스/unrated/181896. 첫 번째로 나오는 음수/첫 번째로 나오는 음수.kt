class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        num_list.forEachIndexed { index, i ->
            if (i < 0) {
                answer = index
                return answer
            }   
        }
        return -1
    }
}