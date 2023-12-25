class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var result = true
        val DQ1 = ArrayDeque<String>()
        val DQ2 = ArrayDeque<String>()
        cards1.map { DQ1.add(it) }
        cards2.map { DQ2.add(it) }

        for (i in goal) {
            if (DQ1.isNotEmpty() && i == DQ1.first()) {
                DQ1.removeFirst()
                continue
            } else if (DQ2.isNotEmpty() && i == DQ2.first()) {
                DQ2.removeFirst()
                continue
            } else result = false
        }

        return if (result) "Yes" else "No"
    }
}