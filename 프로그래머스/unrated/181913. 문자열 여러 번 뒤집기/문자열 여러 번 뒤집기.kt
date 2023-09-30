class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer = my_string
        queries.map { answer = answer.replaceRange(it[0]..it[1], answer.substring(it[0]..it[1]).reversed()) }
        return answer
    }
}