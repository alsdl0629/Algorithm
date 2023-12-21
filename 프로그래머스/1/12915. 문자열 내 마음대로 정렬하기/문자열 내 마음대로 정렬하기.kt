class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
    var answer = strings

    return answer.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()
}
}