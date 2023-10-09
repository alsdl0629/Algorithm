import java.util.Stack
class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = Stack<Int>()
        arr.mapIndexed { index, value ->
            if (flag[index]) for (i in 0 .. value * 2 - 1) {
                answer.push(value)
            }
            else for (i in 0 until value) {
                answer.pop()
            }
        }
        return answer.toIntArray()
    }
}