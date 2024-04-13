class Solution {
    fun solution(s: String): IntArray {
        val arr = mutableListOf<List<String>>()
        for (i in s.split("},")) arr.add(i.replace("{", "").replace("}", "").split(","))
        arr.sortBy { it.size }

        val answer = mutableSetOf<Int>()
        for (i in arr) {
            for (j in i) answer.add(j.toInt())
        }
        return answer.toIntArray()
    }
}