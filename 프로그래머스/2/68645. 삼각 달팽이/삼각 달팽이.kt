class Solution {
    fun solution(n: Int): IntArray {
         var answer = Array(n) { IntArray(n) }
    var flow = 0
    var count = 0
    var x = -1
    var y = 0
    for (i in n downTo 1) {
        when (flow % 3) {
            0 -> while (x + 1 < n && answer[x + 1][y] == 0) answer[++x][y] = ++count
            1 -> while (y + 1 < n && answer[x][y + 1] == 0) answer[x][++y] = ++count
            2 -> while (answer[x - 1][y - 1] == 0) answer[--x][--y] = ++count
        }
        flow++
    }
    return answer.flatMap {
        it.filter {
            it != 0
        } .toList()
    }.toIntArray()
    }
}