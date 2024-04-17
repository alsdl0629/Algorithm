class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        val size = sequence.size
        val arr = mutableListOf<Triple<Int, Int, Int>>()
        var total = 0
        var end = 0
        for (start in 0 until size) {
            while (k > total && size > end) {
                total += sequence[end]
                end++
            }
            if (k == total) arr += Triple(start, end - 1, end - start - 1)
            total -= sequence[start]
        }
        val first = arr.sortedWith(compareBy { it.third }).first()
        return intArrayOf(first.first, first.second)
    }
}