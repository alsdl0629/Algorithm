class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var str = ""
        myStr.map {
            if (it != 'a' && it != 'b' && it != 'c') str += it
            else {
                if (str.isNotEmpty()) answer += str
                str = ""
            }
        }
        if (str.isNotEmpty()) answer += str
        return if (answer.isEmpty()) arrayOf("EMPTY") else answer
    }
}