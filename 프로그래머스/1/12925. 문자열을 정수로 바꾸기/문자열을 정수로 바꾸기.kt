class Solution {
    fun solution(s: String): Int {
        return if (s[0] == '-') -1 * s.slice(1..s.lastIndex).toInt()
        else s.slice(0..s.lastIndex).toInt()
    }
}