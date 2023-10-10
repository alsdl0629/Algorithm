class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        val DQ = ArrayDeque<Int>()
        for (i in progresses.indices) {
            var day = 0
            var sum = progresses[i]
            while (true) {
                sum += speeds[i]
                day++
                if (sum >= 100) break
            }
            DQ.addLast(day)
        }
        while (DQ.isNotEmpty()) {
            var removal = DQ.removeFirst()
            var count = 1
            while (DQ.isNotEmpty()) {
                if (removal >= DQ.first()) {
                    count++
                    DQ.removeFirst()
                }
                else break
            }
            answer += count
        }
        return answer
    }
}