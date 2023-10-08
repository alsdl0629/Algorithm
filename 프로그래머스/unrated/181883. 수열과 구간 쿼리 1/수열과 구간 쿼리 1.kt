class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer = arr
        queries.forEachIndexed { idx1, ints -> for (a in ints[0]..ints[1]) answer[a]++ }
        return answer
    }
}