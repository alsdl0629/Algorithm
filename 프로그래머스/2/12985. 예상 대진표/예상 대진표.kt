class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var na = a
        var nb = b
        while (na != nb) {
            na = (na + 1) / 2
            nb = (nb + 1) / 2
            answer++
        }
        return answer
    }
}