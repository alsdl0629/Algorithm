class Solution {
    fun solution(q: Int, r: Int, code: String) = code.chunked(q).filter { it.length > r }.map { it[r] }.joinToString("")
}