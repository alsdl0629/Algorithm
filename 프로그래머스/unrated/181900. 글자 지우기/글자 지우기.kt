class Solution {
    fun solution(my_string: String, indices: IntArray): String {
         var answer = ""
        for (i in 0..my_string.length - 1) {
            if (indices.contains(i)) continue
            answer += my_string[i]
        }
        return answer
    }
}