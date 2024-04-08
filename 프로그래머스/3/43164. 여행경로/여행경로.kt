class Solution {
    private lateinit var visited: BooleanArray
    private var tmp = mutableListOf<String>()
    private var result = mutableListOf<String>()

    fun solution(tickets: Array<Array<String>>): Array<String> {
        visited = BooleanArray(tickets.size)
        tickets.sortBy { it[1] }

        dfs(0, "ICN", tickets)

        return result.toTypedArray()
    }

    private fun dfs(cnt: Int, current: String, tickets: Array<Array<String>>) {
        if (cnt == tickets.size) {
            if (result.isEmpty()) {
                result.addAll(tmp)
                result.add(current)
            }
        } else {
            for (i in tickets.indices) {
                if (!visited[i] && current == tickets[i][0]) {
                    visited[i] = true
                    tmp.add(current)
                    dfs(cnt + 1, tickets[i][1], tickets)
                    visited[i] = false
                    tmp.removeLast()
                }
            }
        }
    }
}