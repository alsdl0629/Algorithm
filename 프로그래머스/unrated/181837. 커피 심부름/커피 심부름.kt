class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        order.map {
            if (it.contains("cafelatte")) answer += 5000
            else if (it.contains("americano") || it.contains("anything")) answer += 4500
        }
        return answer
    }
}