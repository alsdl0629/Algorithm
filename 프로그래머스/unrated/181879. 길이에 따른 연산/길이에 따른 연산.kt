class Solution {
    fun solution(num_list: IntArray): Int {
    var result = 1
    if (num_list.size > 10) {
        num_list.forEach {
            result += it
        }
        result -= 1
    } else {
        num_list.forEach {
            result *= it
        }
    }
    return result
}
}