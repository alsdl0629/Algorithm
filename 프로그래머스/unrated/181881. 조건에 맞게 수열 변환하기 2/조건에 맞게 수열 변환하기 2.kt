class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
    var arr1 = arr
    for (j in arr.indices) {
        var arr2 = IntArray (arr1.size)
        for (i in arr1.indices) {
            if (arr1[i] >= 50 && arr1[i] % 2 == 0) arr2[i] /= 2
            else if (arr1[i] < 50 && arr1[i] % 2 != 0) arr2[i] = arr1[i] * 2 + 1
            else arr2[i] = arr1[i]
        }
        if (arr1 contentEquals arr2) {
            answer = j
            break
        }
        arr1 = arr2
    }
    return answer
    }
}