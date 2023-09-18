import java.util.Stack
class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
    var S = Stack<Int>()
    moves.forEach {
        for (i in board.indices) {
            if (board[i][it - 1] != 0) {
                if (S.isNotEmpty() && S.peek() == board[i][it - 1]) {
                    answer += 2
                    S.pop()
                } else {
                    S.push(board[i][it - 1])
                }
                board[i][it - 1] = 0
                break
            }
        }
    }
    return answer
    }
}