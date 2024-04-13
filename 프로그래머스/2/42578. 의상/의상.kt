class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val map = mutableMapOf<String, Int>()

        clothes.forEach { map[it[1]] = map.getOrDefault(it[1], 0) + 1 }
        map.values.forEach { answer *= it + 1 }
        return answer - 1
    }
}