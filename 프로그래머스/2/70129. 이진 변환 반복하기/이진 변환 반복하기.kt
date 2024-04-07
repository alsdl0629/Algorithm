class Solution {
    fun solution(s: String): IntArray {
        val answer: IntArray = intArrayOf(0, 0)

        var tmp = s
        while (tmp != "1") {
            var zeroCount = 0
            var noZeroCount = 0

            tmp.forEach {
                if (it == '0') zeroCount++
                else noZeroCount++
            }

            tmp = Integer.toBinaryString(noZeroCount)

            answer[0]++
            answer[1] = answer[1] + zeroCount
        }
        return answer
    }
}