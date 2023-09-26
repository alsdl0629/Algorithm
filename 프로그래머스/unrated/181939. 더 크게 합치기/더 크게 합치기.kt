class Solution {
    fun solution(a: Int, b: Int): Int {
    var answer: Int = 0
    if ("$a$b".toInt() > "$b$a".toInt()) answer = "$a$b".toInt()
    else answer = "$b$a".toInt()
    return answer
}
}