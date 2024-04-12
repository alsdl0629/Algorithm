class Solution {
    fun solution(citations: IntArray): Int {
        if (citations.size == 1 && citations[0] == 0 || citations.all { it == 0 }) return 0
        var result = Int.MIN_VALUE
        val size = citations.size
        for (i in 1..size) {
            val quotation = citations.filter { it >= i }.mapIndexed { index, i -> i }
            val notQuotation = citations.filter { !quotation.contains(it) && it <= i }
            if (quotation.size >= i && quotation.size + notQuotation.size == size) {
                result = maxOf(result, i)
            }
        }
        return result
    }
}