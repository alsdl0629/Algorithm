class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var start = 0
        var end = 0
        var total = 0
        val arr = mutableListOf<Triple<Int, Int, Int>>()
        val size = sequence.size

        while (true) {
            if (k > total) {
                if (end == size) break
                total += sequence[end++]
            }
            else if (k < total) total -= sequence[start++]
            else {
                arr.add(Triple(start, end - 1, end - start))
                total -= sequence[start++]
            }
        }

        val min = arr.sortedBy { it.third }[0]
        return intArrayOf(min.first, min.second)
    }
}