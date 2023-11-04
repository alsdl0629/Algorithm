class Solution {
    fun solution(n: Int): Array<IntArray> {
    var answer = Array(n) { IntArray(n) { 0 } }
    var flow = 0
    var count = 0
    var i = 0
    var j = -1
    while (count != n * n) {
        when (flow % 4) {
            0 -> {
                while (j + 1 < n && answer[i][j + 1].toBoolean()) answer[i][++j] = ++count
            }
            1 -> {
                while (i + 1 < n && answer[i + 1][j].toBoolean()) answer[++i][j] = ++count
            }
            2 -> {
                while (j > 0 && answer[i][j - 1].toBoolean()) answer[i][--j] = ++count
            }
            3 -> {
                while (i > 0 && answer[i - 1][j].toBoolean()) answer[--i][j] = ++count

            }
        }
        flow++
    }
    return answer
}

fun Int.toBoolean(): Boolean = if (this == 0) true else false
}