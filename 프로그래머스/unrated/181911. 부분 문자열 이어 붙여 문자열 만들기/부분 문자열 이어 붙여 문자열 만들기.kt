class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        for (i in my_strings.indices) answer += my_strings[i].substring(parts[i][0]..parts[i][1])
        return answer
    }
}