class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
    myString.mapIndexed { index, c ->
        if (index + pat.length - 1 < myString.length && c == pat[0]) {
            var str: String = ""
            for (i in index until index + pat.length) {
                str += myString[i]
            }
            if (str == pat) answer++
        }
    }
    return answer
    }
}