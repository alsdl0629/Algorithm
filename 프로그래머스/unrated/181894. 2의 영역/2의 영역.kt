class Solution {
    fun solution(arr: IntArray): IntArray {
        var a = mutableListOf<Int>()
    for (i in arr.indices) if (arr[i] == 2) a += i
    return when {
        a.size == 1 -> intArrayOf(2)
        a.size >= 2 -> arr.slice(a[0]..a[a.lastIndex]).toIntArray()
        else -> intArrayOf(-1)
    }
    }
}