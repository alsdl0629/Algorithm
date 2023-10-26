class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var answer = arr.map { it.toMutableList() }.toMutableList()
        var size1 = arr.size
        var size2 = arr[0].size
        if (size1 > size2) {
            while (size1 != size2) {
                for (i in arr.indices) answer[i] += 0
                size2++
            }
        } else if (size1 < size2) {
            while (size1 != size2) {
                answer.add(size1, IntArray(size2) {0}.toMutableList())
                size1++
            }
        } else return answer.map { it.toIntArray() }.toTypedArray()
        return answer.map { it.toIntArray() }.toTypedArray()
    }
}