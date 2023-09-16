class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        strArr.forEachIndexed { index, s ->
            if (index % 2 == 0) answer += s.lowercase()
            else answer += s.uppercase()
        }
        return answer
    }
}