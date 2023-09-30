import java.lang.IllegalArgumentException
class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if (s.length != 4 && s.length != 6) answer = false
        s.map {
            try {
                it.digitToInt()
            } catch (e: IllegalArgumentException) {
                answer = false
            }
        }
        return answer
    }
}