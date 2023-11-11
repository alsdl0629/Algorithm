class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        repeat(seoul.size) {
            if (seoul[it] == "Kim") return "김서방은 ${it}에 있다"
        }
        return answer
    }
}