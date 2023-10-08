class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer = Array<Array<Int>>(n) { Array<Int>(n) {0} }
    for (i in 0 until n) for (j in 0 until n) if (i == j) answer[i][j] = 1
    return answer.map { it.toIntArray() }.toTypedArray()
    }
}