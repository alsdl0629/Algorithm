class Solution {
    fun solution(rny_string: String): String {
        var answer = ""
        rny_string.forEach { 
            if (it == 'm') {
                answer += "rn"
            } else {
                answer += it
            }
        }
        return answer
    }
}