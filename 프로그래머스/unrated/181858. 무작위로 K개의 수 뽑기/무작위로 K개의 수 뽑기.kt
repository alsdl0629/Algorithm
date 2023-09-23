class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer = mutableListOf<Int>()
    for (i in 0 until arr.size) {
        if (answer.size == k) break
        if (!answer.contains(arr[i])) answer.add(arr[i])
    }
    while (answer.size < k) answer.add(-1)
    return answer.toIntArray()
    }
}