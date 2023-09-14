class Solution {
    fun solution(n: Int, control: String): Int {
        var answer = n
        control.forEach {
            when {
                it == 'w' -> answer += 1
                it == 's' -> answer -= 1
                it == 'd' -> answer += 10
                it == 'a' -> answer -= 10
            }
        }
        return answer
    }
}