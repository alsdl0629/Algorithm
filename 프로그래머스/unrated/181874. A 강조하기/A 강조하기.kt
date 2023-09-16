class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        myString.lowercase().forEach {
            if (it == 'a') {
                answer += it.uppercaseChar()
            } else {
                answer += it
            }
        }
        return answer
    }
}