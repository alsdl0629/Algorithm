class Solution {
    fun solution(n: Long): Long {
        var arr = mutableListOf<Char>()
        n.toString().forEach {
            arr += it
        }
        return arr.sorted().reversed().joinToString("").toLong()
    }
}