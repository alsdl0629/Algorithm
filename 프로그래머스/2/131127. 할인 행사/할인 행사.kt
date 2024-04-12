class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer = 0
        if (want.all { !discount.contains(it) }) return 0

        val map = HashMap<String, Int>() // first: 제품명, second: 제품 개수
        want.forEachIndexed { index, s -> map[s] = number[index] }

        val tenDayLater = 10
        var idx = 0
        loop@ while (true) {
            if (idx + tenDayLater > discount.size) break@loop
            else {
                val copyOfRange = discount.copyOfRange(idx, tenDayLater + idx)
                val j = idx
                for (i in copyOfRange.indices) {
                    if (map[discount[i + j]] != null) {
                        if (map.entries.any { it.value < 0 }) {
                            want.forEachIndexed { index, s -> map[s] = number[index] }
                            idx++
                            continue@loop
                        }
                        map[discount[i + j]] = map[discount[i + j]]!! - 1
                    } else {
                        want.forEachIndexed { index, s -> map[s] = number[index] }
                        idx++
                        continue@loop
                    }
                }
                if (map.entries.all { it.value == 0 }) {
                    answer++
                    idx++
                    want.forEachIndexed { index, s -> map[s] = number[index] }
                }
            }
        }
        return answer
    }
}