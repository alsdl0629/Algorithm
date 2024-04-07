class Solution {
    private lateinit var visited: BooleanArray
    private var result = 50

    fun solution(begin: String, target: String, words: Array<String>): Int {
        if (!words.contains(target)) return 0
        visited = BooleanArray(words.size) {false}
        dfs(begin, target, words, 0)
        return result
    }

    private fun dfs(begin: String, target: String, words: Array<String>, step: Int) {
        if (step >= result) return
        else if (begin == target) result = minOf(result, step)
        else {
            for (i in words.indices) {
                if (!visited[i] && checkOneLetterDiff(begin, words[i])) {
                    visited[i] = true
                    dfs(words[i], target, words, step + 1)
                    visited[i] = false
                }
            }
        }
    }

    private fun checkOneLetterDiff(first: String, second: String): Boolean {
        var count = 0
        first.forEachIndexed { index, _ ->
            if (first[index] != second[index]) count++
        }

        return count == 1
    }
}