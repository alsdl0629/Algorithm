class Solution {
    fun solution(n: Int): String {
        var answer = ""
        if (n % 2 == 0) {
            for (i in 1 .. n / 2) answer += "수박"
        } else {
            for (i in 1 .. n / 2) answer += "수박"
            answer += "수"
        }
        return answer
    }
}