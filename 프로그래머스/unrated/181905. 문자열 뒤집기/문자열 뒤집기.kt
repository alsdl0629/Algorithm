class Solution {
    fun solution(my_string: String, s: Int, e: Int) = my_string.replace(my_string.substring(s..e), my_string.substring(s..e).reversed())
}