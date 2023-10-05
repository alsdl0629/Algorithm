class Solution {
    fun solution(num_list: IntArray): Int {
        var a = 0
    var b = 0
    for (i in num_list.indices) {
        if (i % 2 == 0) a += num_list[i]
        else b += num_list[i]
    }
    return if (a > b) a else b
    }
}