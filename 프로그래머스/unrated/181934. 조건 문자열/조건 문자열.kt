class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
         var answer: Boolean = false
    if (ineq == ">") {
        if (eq == "=" && n >= m) answer = true
        else if (eq == "!" && n > m)  answer = true
    } else {
        if (eq == "=" && n <= m) answer = true
        else if (eq == "!" && n < m)  answer = true
    }
    return if (answer) 1 else 0
    }
}