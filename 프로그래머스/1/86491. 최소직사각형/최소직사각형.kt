class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var arr = Array(sizes.size) { IntArray(2) }
        sizes.mapIndexed { index, ints ->
            if (ints[0] >= ints[1]) {
                arr[index][0] = ints[0]
                arr[index][1] = ints[1]
            }
            else {
                arr[index][0] = ints[1]
                arr[index][1] = ints[0]
            }
        }
        var wMax = -999
        var hMax = -999
        arr.map {
            if (it[0] > wMax) wMax = it[0]
            if (it[1] > hMax) hMax = it[1]
        }
        return wMax * hMax
    }
}