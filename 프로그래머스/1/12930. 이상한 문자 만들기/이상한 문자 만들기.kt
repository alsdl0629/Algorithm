class Solution {
    fun solution(s: String): String {
        var answer = ""
        s.split(" ").mapIndexed { index, str ->
            str.mapIndexed { index1, c -> 
                answer += if (index1 % 2 == 0) c.uppercase() else c.lowercase()
            }
            if (index != s.split(" ").lastIndex) answer += " " 
        }
        return answer
    }
}