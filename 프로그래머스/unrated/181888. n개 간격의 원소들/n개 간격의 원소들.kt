class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = if (num_list.size % n == 0) IntArray(num_list.size / n) else IntArray(num_list.size / n + 1)
        var j = 0
        for (i in 0..num_list.size-1 step(n)) {
            answer[j] = num_list[i]
            j++
        }
        return answer
    }
}