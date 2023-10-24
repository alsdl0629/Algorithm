import java.util.Stack
class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = Stack<Int>()
        for (i in arr.indices) {
            if (answer.isEmpty()) answer.push(arr[i])
            else if (answer.peek() == arr[i]) answer.pop()
            else if (answer.peek() != arr[i]) answer.push(arr[i])
        }
        return if (answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
    }
}