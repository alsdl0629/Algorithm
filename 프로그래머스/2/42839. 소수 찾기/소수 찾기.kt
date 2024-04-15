import kotlin.math.sqrt
class Solution {
    private val arr = mutableSetOf<Int>()
    private lateinit var visited: BooleanArray

    fun solution(numbers: String): Int {
        var answer = 0
        visited = BooleanArray(numbers.length)
        dfs(numbers, "", 0)

        for (i in arr) {
            if (isPrime(i)) answer++
        }
        return answer
    }

    private fun dfs(numbers: String, s: String, depth: Int) {
        if (depth > numbers.length) return
        else {
            for (i in numbers.indices) {
                if (!visited[i]) {
                    visited[i] = true
                    arr.add((s + numbers[i]).toInt())
                     dfs(numbers, s + numbers[i], depth + 1)
                    visited[i] = false
                }
            }
        }
    }

    private fun isPrime(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..sqrt(n.toDouble()).toInt()) if (n % i == 0) return false
        return true
    }
}