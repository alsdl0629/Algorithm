class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var a = 0
        var b = 0
        num_list.forEach { i ->
            if (i % 2 == 0) {
                if (i == 0) {
                    a = i
                } else {
                    a = a * 10 + i
                }
            } else {
                if (i == 0) {
                    b = i
                } else {
                    b = b * 10 + i
                }
            }
        }
        answer = a + b
        return answer
    }
}