class Solution {
    private lateinit var visited: BooleanArray
    private var result = 50

    fun solution(begin: String, target: String, words: Array<String>): Int {
        if (!words.contains(target)) return 0
        visited = BooleanArray(words.size)

        dfs(begin, target, words, 0)
        return result
    }

    fun dfs(begin: String, target: String, words: Array<String>, cnt: Int) {
        if (cnt >= result) return
        else if (begin == target) result = minOf(result, cnt)
        else {
            for (i in words.indices) {
                if (!visited[i] && checkOneLetterDiff(begin, words[i])) {
                    visited[i] = true
                    dfs(words[i], target, words, cnt + 1)
                    visited[i] = false
                }
            }
        }
    }

    private fun checkOneLetterDiff(begin: String, target: String): Boolean {
        var cnt = 0
        begin.forEachIndexed { index, _ ->
            if (begin[index] !=target[index]) cnt++
        }
        return cnt == 1
    }
}