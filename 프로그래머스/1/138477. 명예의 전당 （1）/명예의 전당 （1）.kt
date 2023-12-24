import java.util.PriorityQueue
class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val PQ = PriorityQueue<Int>(reverseOrder())
        score.map {
            if (PQ.size == k) {
                val min = PQ.minOrNull()!!
                if (min < it) {
                    PQ.remove(min)
                    PQ.add(it)
                }
            } else PQ.add(it)
            answer += PQ.minOrNull()!!
        }
        return answer
    }
}