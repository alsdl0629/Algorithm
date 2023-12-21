class Solution {
    fun solution(s: String): IntArray {
    var answer: IntArray = intArrayOf()
    var store = emptyArray<Char>()
    s.mapIndexed { index, c ->
        if (store.lastIndexOf(c) == -1) answer += store.lastIndexOf(c)
        else answer += index + - store.lastIndexOf(c)
        store += c
    }
    return answer
}
}