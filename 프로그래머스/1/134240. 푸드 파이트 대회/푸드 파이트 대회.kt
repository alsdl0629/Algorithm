class Solution {
    fun solution(food: IntArray): String {
        var size = 1
        for (i in 1 until food.size) {
            if (food[i] == 1) continue
            else if (food[i] % 2 == 0) size += food[i]
            else if (food[i] % 2 == 1) size += food[i] - 1
        }
        var arr = IntArray(size)
        var first = 0
        var last = arr.size - 1
        for (i in 1 until food.size) {
            if (food[i] == 1) continue
            else if (food[i] % 2 == 0) {
                for (j in 0 until food[i] / 2) {
                    arr[first] = i
                    arr[last] = i
                    first++
                    last--
                }
            }
            else if (food[i] % 2 == 1) {
                for (j in 0 until (food[i] -1) / 2) {
                    arr[first] = i
                    arr[last] = i
                    first++
                    last--
                }
            }
        }
        arr[arr.size / 2] = 0
        return arr.toMutableList().joinToString("")
    }
}