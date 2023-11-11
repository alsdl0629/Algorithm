class Solution {
    fun solution(arr: IntArray): IntArray {
        if (arr.size == 1) return intArrayOf(-1)
        var arr1 = arr.toMutableList()
        var min = 999999
        for (i in arr1.indices) if (arr1[i] < min) min = arr1[i]
        arr1.remove(min)
        return arr1.toIntArray()
    }
}