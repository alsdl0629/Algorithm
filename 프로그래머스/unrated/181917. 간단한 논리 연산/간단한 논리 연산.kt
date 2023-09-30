class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        var answer: Boolean = true
        var a = x1 or x2
        var b = x3 or x4
        answer = a and b
        return answer
    }
}