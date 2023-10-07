class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        myString.map {
            answer += if (it.code < 'l'.code) 'l'
            else it
        }
        return answer
    }
}