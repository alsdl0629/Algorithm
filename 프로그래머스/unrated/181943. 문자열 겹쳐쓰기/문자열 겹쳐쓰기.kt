class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
         var answer: String = ""
    var str = ""
    if (overwrite_string.length + 1 <= my_string.length - s) { // my_stirng 이 더 길면
        str = my_string.substring(0, s)
        var end = my_string.substring(s + overwrite_string.length)
        println(str)
        answer = str + overwrite_string + end
    } else {
        str = my_string.substring(0, s)
        answer = str + overwrite_string
    }
    return answer
    }
}