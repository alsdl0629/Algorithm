import java.util.Stack
class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer = Stack<Int>()
        intervals.map { for (i in it[0]..it[1]) { answer.push(arr[i]) } }
        return answer.toIntArray()
    }
}