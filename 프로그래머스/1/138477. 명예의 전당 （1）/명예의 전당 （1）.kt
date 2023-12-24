import java.util.PriorityQueue
class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val PQ = PriorityQueue<Int>()
        score.map {
            if (PQ.size == k) {
                PQ.add(it)
                PQ.remove()
            } else PQ.add(it)
            answer += PQ.peek()
        }
        return answer
    }
}