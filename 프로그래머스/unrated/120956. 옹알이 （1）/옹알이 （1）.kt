class Solution {
    fun solution(babbling: Array<String>): Int {
        var count = 0
        val regex = Regex("^(aya|ye|woo|ma)+$")
        babbling.map {
            if (it.matches(regex)) count++
        }
        return count
    }
}