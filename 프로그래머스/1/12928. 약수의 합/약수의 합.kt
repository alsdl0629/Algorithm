class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var num = 1
        for (a in n downTo 1) {
            if (n % num == 0) answer += num
            num++
        }
        return answer
    }
}