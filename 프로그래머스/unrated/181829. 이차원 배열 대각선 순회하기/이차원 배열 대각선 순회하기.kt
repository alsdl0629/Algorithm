class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
    board.mapIndexed { idx1, ints ->
        ints.mapIndexed { idx2, i ->
            if (idx1 + idx2 <= k) answer += board[idx1][idx2]
        }
    }
    return answer
    }
}