class Solution {
    private var result = 0

    private fun dfs(total: Int, idx: Int, target: Int, numbers: IntArray) {
        if (idx == numbers.size) {
            if (total == target) result++
        } else {
            dfs(total + numbers[idx], idx + 1, target, numbers)
            dfs(total - numbers[idx], idx + 1, target, numbers)
        }
    }

    fun solution(numbers: IntArray, target: Int): Int {
        dfs(0, 0, target, numbers)

        return result
    }
}