import java.util.Collections
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue
class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
    var answer = 0
    val Queue: Queue<Int> = LinkedList()
    val PQueue = PriorityQueue<Int>(Collections.reverseOrder())
    var loc = location

    priorities.map {
        Queue.add(it)
        PQueue.add(it)
    }

    while (true) {
        val removal = Queue.poll()
        if (removal == PQueue.peek()) {
            PQueue.poll()
            answer++
            if (loc == 0) break
            loc--
        } else {
            Queue.add(removal)
            loc--
            if (loc < 0) loc = PQueue.size - 1
        }
    }
    return answer
}
}