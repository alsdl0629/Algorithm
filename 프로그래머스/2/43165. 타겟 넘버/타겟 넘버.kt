class Solution {
    private var result = 0
    private lateinit var array: IntArray

    private fun dfs(total: Int, idx: Int, target: Int) {
        if (idx == array.size) {
            if (total == target) result++
        }
        else {
            dfs(total + array[idx], idx + 1, target)
            dfs(total - array[idx], idx + 1, target)
        }
    }

    fun solution(numbers: IntArray, target: Int): Int {
        array = numbers
        dfs(0, 0, target)
        return result
    }
}