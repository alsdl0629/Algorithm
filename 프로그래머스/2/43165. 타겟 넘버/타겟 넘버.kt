class Solution {
    private var cnt = 0
    private lateinit var arr: IntArray

    fun solution(numbers: IntArray, target: Int): Int {
        arr = numbers
        dfs(0, 0, target)
        return cnt
    }

    fun dfs(idx: Int, total: Int, target: Int) {
        if (arr.size == idx) {
            if (total == target) cnt++
        } else {
            dfs(idx + 1, total + arr[idx], target)
            dfs(idx + 1, total - arr[idx], target)
        }
    }
}