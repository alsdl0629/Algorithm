class Solution {
    fun solution(elements: IntArray): Int {
        val newArr = IntArray(elements.size * 2) { 0 }
        for (i in newArr.indices) newArr[i] = elements[i % elements.size]

        val set = mutableSetOf<Int>()

        for (i in 1..elements.size) {
            for (j in 0..elements.size) {
                val copyOfRange = newArr.copyOfRange(j, j + i)
                set.add(copyOfRange.sum())
            }
        }

        return set.size
    }
}