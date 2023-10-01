class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var arr = mutableListOf<String>()
        var i = 0
        while (i + m != my_string.length + m) {
            arr += my_string.substring(i until i + m)
            i += m
        }
        var answer = ""
        arr.forEach { answer += it[c - 1] }
        return answer
    }
}