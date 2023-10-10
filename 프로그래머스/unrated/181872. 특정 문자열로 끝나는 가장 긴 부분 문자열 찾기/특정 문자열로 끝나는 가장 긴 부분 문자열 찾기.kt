class Solution {
    fun solution(myString: String, pat: String): String {
        var answer: String = ""
    (0..myString.length - pat.length).map {
        var str = ""
        if (pat.length == 1) str = myString[it].toString()
        else for (i in it until it + pat.length) str += myString[i]
        if (str == pat) answer = myString.substring(0 until it + pat.length)
    }
    return answer
    }
}