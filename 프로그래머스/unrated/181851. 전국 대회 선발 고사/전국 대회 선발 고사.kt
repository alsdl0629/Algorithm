class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var answer = intArrayOf()
    var map = mutableMapOf<Int, Boolean>()
    rank.forEachIndexed { index, i ->
        map[i] = attendance[index]
    }
    var newMap = map.toSortedMap().forEach { t, u ->
        if (u == true && answer.size < 3) answer += t
    }
    return 10000 * rank.indexOf(answer[0]) + 100 * rank.indexOf(answer[1]) + rank.indexOf(answer[2])
    }
}