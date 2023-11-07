class Solution {
    fun solution(x: Int): Boolean {
        var arr = x.toString().toMutableList()
        var sum = arr.map { it.digitToInt() }.sum()
        return if (x % sum == 0) true else false
    }
}