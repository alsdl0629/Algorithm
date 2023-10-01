class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
    var s = my_string
    while (s.isNotEmpty()) {
        answer += s
        var i = 1
        s = s.substring(i..s.lastIndex)
    }
    return answer.sortedArray()
    }
}