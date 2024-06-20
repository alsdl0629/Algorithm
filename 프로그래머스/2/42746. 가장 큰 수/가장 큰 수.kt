class Solution {
    fun solution(numbers: IntArray): String {
    val result = numbers.map { it.toString() }
        .sortedByDescending { it.repeat(3) }
    return result.joinToString("").toBigInteger().toString()
}
}