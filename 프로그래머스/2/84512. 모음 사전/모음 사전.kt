class Solution {
    private var alphabet = arrayOf('A', 'E', 'I', 'O', 'U')
    private val result = mutableListOf<String>()

    fun solution(word: String): Int {
        var answer = 0
        dfs("")

        result.forEachIndexed { index, s -> if (s == word) return index }
        return answer
    }

    fun dfs(s: String) {
        if (s.length == 6) return
        else {
            result.add(s)
            for (i in alphabet.indices) dfs(s + alphabet[i])
        }
    }
}