class Solution {
    fun solution(my_string: String): IntArray {
        var answer = Array(52) {0}
    my_string.forEach {
        if (it.code in 65..90) {
            answer[it.code - 65]++
        } else if (it.code in 97..122) {
            answer[it.code - 71]++
        }
    }
    return answer.toIntArray()
    }
}