class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        commands.map {
            val sortedSlice = array.slice(it[0] - 1..it[1] - 1).sorted()
            answer += sortedSlice[it[2] - 1]
        }
        return answer
    }
}