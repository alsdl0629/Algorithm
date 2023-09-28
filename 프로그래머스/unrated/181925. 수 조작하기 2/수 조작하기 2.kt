class Solution {
    fun solution(numLog: IntArray): String {
        var sb = StringBuilder()
    for (i in 1 until numLog.size) {
        var result = numLog[i -1] - numLog[i]
        when (result) {
            1 -> sb.append("s")
            -1 -> sb.append("w")
            10 -> sb.append("a")
            -10 -> sb.append("d")
        }
    }
    return sb.toString()
    }
}