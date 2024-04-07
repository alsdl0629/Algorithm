class Solution {
    private lateinit var visited: BooleanArray

    fun dfs(computers: Array<IntArray>, idx: Int) {
        visited[idx] = true

        for (i in computers.indices) {
            if (computers[idx][i] == 1 && !visited[i]) {
                dfs(computers, i)
            }
        }
    }

    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        visited = BooleanArray(n) { false }


        for (i in 0 until n) {
            if (!visited[i]) {
                dfs(computers, i)
                answer++
            }
        }
        return answer
    }
}