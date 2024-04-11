class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        var nk = k
        val map = HashMap<Int, Int>() // first: 귤 크기, second: 귤 개수
        tangerine.forEach { map[it] = map.getOrDefault(it, 0) + 1 }
        val pairs = map.toList().sortedWith(compareBy { -it.second })

        for (i in pairs.indices) {
            if (nk <= 0) break
            answer++
            nk -= pairs[i].second
        }
        return answer
    }
}