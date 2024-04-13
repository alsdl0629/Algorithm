class Solution {
    private lateinit var visited: BooleanArray

    fun solution(n: Int, computers: Array<IntArray>): Int {
        visited = BooleanArray(n)
        var cnt = 0
        for (i in computers.indices) {
            if (!visited[i]) {
                dfs(i, computers)
                cnt++
            }
        }
        return cnt
    }

    fun dfs(n: Int, computers: Array<IntArray>) {
        for (i in computers[n].indices) {
            if (!visited[i] && computers[n][i] == 1) {
                visited[n] = true
                dfs(i, computers)
            }
        }
    }
}