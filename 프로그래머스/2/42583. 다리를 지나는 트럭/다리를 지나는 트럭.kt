class Solution {
    fun solution(bridgeLength: Int, weight: Int, truckWeights: IntArray): Int {
        var time = 0

        val trucks = ArrayDeque<Int>()
        truckWeights.forEach {
            trucks.addFirst(it)
        }

        val bridge = ArrayDeque<Int>(bridgeLength)
        for (i in 1..bridgeLength) {
            bridge.addFirst(0)
        }

        var currentWeight = 0
        while (trucks.isNotEmpty()) {
            time++
            currentWeight -= bridge.removeLast()

            if (currentWeight + trucks.last() <= weight) {
                currentWeight += trucks.last()
                bridge.addFirst(trucks.removeLast())
            } else bridge.addFirst(0)
            
        }

        return time + bridgeLength
    }
}