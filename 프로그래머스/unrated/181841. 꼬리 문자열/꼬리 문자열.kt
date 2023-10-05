class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        str_list.forEach { if (!it.contains(ex)) answer += it }
        return answer
    }
}