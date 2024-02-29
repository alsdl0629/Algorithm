class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val arr = arrayOf("aya", "ye", "woo", "ma")

        babbling.forEach {
            var str = it
            for (i in arr) {
                if (str.contains("$i$i")) continue
                else str = str.replace(i, " ")
            }
            if (str.trim().isEmpty()) answer++
        }
        return answer
    }
}