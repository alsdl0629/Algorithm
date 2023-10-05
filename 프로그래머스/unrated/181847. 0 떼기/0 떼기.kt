class Solution {
    fun solution(n_str: String): String {
        var answer: String = ""
    for (i in n_str.indices) {
        if (n_str[i] != '0') break
        answer = n_str.substring(i + 1.. n_str.lastIndex)
    }
    return if (answer == "") n_str else answer
    }
}