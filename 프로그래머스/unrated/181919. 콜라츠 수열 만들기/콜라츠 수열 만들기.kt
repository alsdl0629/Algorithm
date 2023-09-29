class Solution {
    fun solution(n: Int): IntArray {
    var answer: IntArray = intArrayOf()
    var a = n
    while (a != 1) {
        answer += a
         if (a % 2 == 0) {
            a /= 2
        }
        else {
            a = 3 * a + 1
        }
    }
    answer += 1
    return answer
}
}