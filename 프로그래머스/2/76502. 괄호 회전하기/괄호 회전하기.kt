import java.util.Stack
class Solution {
    fun solution(s: String): Int {
        var answer = 0
        val S = Stack<Char>()
        loop@for (i in 0 until s.length) {
            for (j in 0 until s.length) {
                val ch = s[(i + j) % s.length]

                if (ch == '(' || ch == '{' || ch == '[') {
                    S.push(ch)
                } else {
                    if (S.isEmpty()) continue@loop
                    else {
                        val peek = S.peek()
                        if (ch == ')' && peek == '(') {
                            S.pop()
                        } else if (ch == '}' && peek == '{') {
                            S.pop()
                        } else if (ch == ']' && peek == '[') {
                            S.pop()
                        } else continue@loop
                    }
                }

                if (j == s.length - 1 && S.isEmpty()) answer++
            }
        }
        return answer
    }
}