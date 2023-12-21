class Solution {
    fun solution(s: String, n: Int): String {
    var answer = ""
    s.map {
        if (it.code in 65..90) {
            if (it.code + n > 90) {
                answer += (it.code + n - 26).toChar().toString()
            } else {
                answer += (it.code + n).toChar().toString()
            }
        } else if (it.code in 97..122) {
            if (it.code + n > 122) {
                answer += (it.code + n - 26).toChar().toString()
            } else {
                answer += (it.code + n).toChar().toString()
            }
        } else answer += it
    }
    return answer
}
}