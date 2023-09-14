class Solution {
    fun solution(myString: String, pat: String): Int {
        var str = ""
        myString.forEach {
            if (it == 'A') str += 'B'
            else str += 'A'
        }

        return if (str.contains(pat)) 1 else 0
    }
}