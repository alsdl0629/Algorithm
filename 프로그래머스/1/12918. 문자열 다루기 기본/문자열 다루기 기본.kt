class Solution {
    fun solution(s: String): Boolean {
        return s.matches(Regex("^(\\d{4}|\\d{6})\$"))
    }
}