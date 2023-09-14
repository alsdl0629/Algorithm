class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer = IntArray(n)
        for (i in 0  until n) {
            answer[i] = num_list[i]
        }
        return answer
    }
}