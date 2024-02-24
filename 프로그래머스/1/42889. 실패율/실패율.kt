class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val fails = mutableListOf<Pair<Int, Double>>()

        var size = stages.size.toDouble()
        for (i in 1..N) {
            var count = 0
            stages.forEach { j ->
                if (i == j) count++
            }
            fails += Pair(i, count / size)
            size -= count
        }

        fails.sortWith(compareBy({-it.second}, {it.first}))
        return fails.map {
            it.first
        }.toIntArray()
    }
}