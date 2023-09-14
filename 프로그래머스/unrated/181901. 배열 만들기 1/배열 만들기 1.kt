class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var arr = mutableListOf<Int>()

        for (i in 1..n) if (i % k == 0) arr.add(i)
    
        return arr.toIntArray()
    }
}