class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var i = 1
        while (true) {
            if (n % i == 1) {
                answer = i
                break
            }
            i++
        }
        return answer
    }
}