class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer = mutableListOf<Int>()
        for (i in left..right) {
            var a = i / n
            var b = i % n
            answer.add(maxOf(a + 1, b + 1).toInt())
        }
        return answer.toIntArray()
    }
}