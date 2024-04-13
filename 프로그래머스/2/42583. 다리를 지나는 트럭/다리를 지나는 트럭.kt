class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var time = 0
        val trucks = ArrayDeque<Int>()
        truck_weights.forEach { trucks.addFirst(it) }

        val moving = ArrayDeque<Int>(bridge_length).apply {
            for (i in 1..bridge_length) this.addFirst(0)
        }

        while (trucks.isNotEmpty()) {
            val last = trucks.last()
            moving.removeLast()
            if (moving.sum() + last <= weight) moving.addFirst(trucks.removeLast())
            else moving.addFirst(0)

            time++
        }
        return time + bridge_length
    }
}