class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (i in num_list.indices step(n)) {
            answer.add(num_list[i])
        }
        return answer.toIntArray()
    }
}