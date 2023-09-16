class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        names.forEachIndexed { index, s ->
            if (index % 5 == 0) {
                answer += s
            }
        }
        return answer
    }
}