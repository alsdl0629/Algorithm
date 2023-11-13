class Solution {
    fun solution(s: String): String {
        var arr = s.toCharArray()
        return arr.sorted().joinToString("").trim().reversed()    
    }
}