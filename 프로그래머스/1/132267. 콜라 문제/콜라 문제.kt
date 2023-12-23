class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        val result = mutableListOf<Int>()
        var bottle = n
        while (true) {
            if (bottle < a) break
            val giveCoke = bottle / a * a
            val getCoke = giveCoke / a * b
            bottle = bottle - giveCoke + getCoke
            result += getCoke
        }
        return result.sum()
    }
}