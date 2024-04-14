class Solution {
    private var result = 50
    private lateinit var visited: BooleanArray

    fun solution(begin: String, target: String, words: Array<String>): Int {
        if (!words.contains(target)) return 0
        visited = BooleanArray(words.size)
        dfs(begin, target, words, 0, )
        return result
    }

    fun dfs(begin: String, target: String, words: Array<String>, count: Int) {
        if (count >= result) return
        else if (begin == target) result = minOf(result, count)
        else {
            for (i in words.indices) {
                if (!visited[i] && checkOneDiffLetter(begin, words[i])) {
                    visited[i] = true
                    dfs(words[i], target, words, count + 1)
                    visited[i] = false
                }
            }
        }
    }

    private fun checkOneDiffLetter(a: String, b: String): Boolean {
        var diffCount = 0
        a.forEachIndexed { index, _ -> if (a[index] != b[index]) diffCount++ }
        return diffCount == 1
    }
}