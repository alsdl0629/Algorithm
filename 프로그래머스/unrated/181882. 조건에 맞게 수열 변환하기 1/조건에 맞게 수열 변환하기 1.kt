import java.util.Stack
class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = Stack<Int>()
    arr.forEach {
        if (it >= 50 && it % 2 == 0) answer += it / 2
        else if (it < 50 && it % 2 == 1)answer += it * 2
        else answer += it
    }
    return answer.toIntArray()
    }
}