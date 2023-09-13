class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        if (k % 2 == 0) {
            for (i in arr.indices) arr[i] += k
        } else {
            for (i in arr.indices) arr[i] *= k
        }
        return arr
    }
}