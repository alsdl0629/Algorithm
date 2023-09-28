import kotlin.math.pow

class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
         var answer: Int = 0
    if (a == b && b == c) {
        answer = (a + b + c) * (a.toDouble().pow(2) + b.toDouble().pow(2) + c.toDouble().pow(2)).toInt() * (a.toDouble().pow(3) + b.toDouble().pow(3) + c.toDouble().pow(3)).toInt()
    } else if (a == b && a != c || a != b && a == c || b == c &&  b != a) {
        answer = (a + b + c) * (a.toDouble().pow(2) + b.toDouble().pow(2) + c.toDouble().pow(2)).toInt()
    } else {
        answer = a + b + c
    }
    return answer
    }
}