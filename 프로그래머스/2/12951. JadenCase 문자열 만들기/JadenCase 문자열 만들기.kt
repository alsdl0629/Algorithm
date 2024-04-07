class Solution {
    fun solution(s: String): String {
        val sb = StringBuilder()
        sb.append(s[0].uppercaseChar())

        var idx = 1
        while (idx != s.length) {
            if (s[idx] == ' ') sb.append(' ')
            else if (s[idx - 1] == ' ') sb.append("${s[idx].uppercaseChar()}")
            else sb.append(s[idx].lowercaseChar())
            idx++
        }

        return sb.toString()
    }
}