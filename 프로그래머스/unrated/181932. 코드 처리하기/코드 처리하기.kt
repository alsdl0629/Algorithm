class Solution {
    fun solution(code: String): String {
        var answer: String = ""
    var isMode = false
    for ((i, value) in code.withIndex()) {
        if (value == '1') isMode = isMode.not()
        else if (!isMode&& i % 2 == 0) answer += value
        else if (isMode && i % 2 == 1) answer += value
    }
    return answer.ifEmpty { "EMPTY" }
    }
}