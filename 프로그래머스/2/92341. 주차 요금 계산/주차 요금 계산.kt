import kotlin.math.ceil
class Solution {
fun solution(fees: IntArray, records: Array<String>): IntArray {
        val answer = mutableListOf<Pair<String, Int>>() // first: 차량 번호, second: 총 요금
        val defaultTime = fees[0]
        val defaultMoney = fees[1]
        val unitTime = fees[2]
        val unitMoney = fees[3]

        // key: 차량 번호, value[first: 시각, second: 내역 타입]
        val map = mutableMapOf<String, MutableList<Pair<String, String>>>()
        records.forEach {
            val split = it.split(" ")
            if (map[split[1]] != null) map[split[1]]!!.add(Pair(split[0], split[2]))
            else map[split[1]] = mutableListOf(Pair(split[0], split[2]))
        }

        map.entries.forEach { carInfo ->
            var totalTime: Double = 0.0
            val size = carInfo.value.size
            if (size % 2 == 0) {
                for (i in 0 until size step 2) {
                    var h1 = 0
                    var m1 = 0
                    var h2 = 0
                    var m2 = 0

                    carInfo.value[i].first.split(":").apply {
                        h1 = this[0].toInt()
                        m1 = this[1].toInt()
                    }
                    carInfo.value[i + 1].first.split(":").apply {
                        h2 = this[0].toInt()
                        m2 = this[1].toInt()
                    }

                    if (h2 == h1) totalTime += m2 - m1
                    else if (h2 > h1) {
                        if (m2 >= m1) {
                            val tmpM = m2 - m1
                            val tmpH = (h2 - h1) * 60
                            totalTime += tmpH + tmpM
                        } else {
                            val tmpM = 60 - m1 + m2
                            val tmpH = (h2 - h1 - 1) * 60
                            totalTime += tmpH + tmpM
                        }
                    }
                }
            } else {
                for (i in 0 until size step 2) {
                    var h1 = 0
                    var m1 = 0
                    var h2 = 0
                    var m2 = 0
                    if (i + 1 == size) {
                        carInfo.value[i].first.split(":").apply {
                            h1 = this[0].toInt()
                            m1 = this[1].toInt()
                        }
                        h2 = 23
                        m2 = 59
                    } else {
                        carInfo.value[i].first.split(":").apply {
                            h1 = this[0].toInt()
                            m1 = this[1].toInt()
                        }
                        carInfo.value[i + 1].first.split(":").apply {
                            h2 = this[0].toInt()
                            m2 = this[1].toInt()
                        }
                    }
                    if (h2 == h1) totalTime += m2 - m1
                    else if (h2 > h1) {
                        if (m2 >= m1) {
                            val tmpM = m2 - m1
                            val tmpH = (h2 - h1) * 60
                            totalTime += tmpH + tmpM
                        } else {
                            val tmpM = 60 - m1 + m2
                            val tmpH = (h2 - h1 - 1) * 60
                            totalTime += tmpH + tmpM
                        }
                    }
                }
            }
            if (totalTime > defaultTime) {
                val ceil = ceil((totalTime - defaultTime) / unitTime)  * unitMoney
                answer += Pair(carInfo.key, (defaultMoney + ceil).toInt())
            } else answer += Pair(carInfo.key, defaultMoney)
        }
        return answer.sortedBy { it.first }.map { it.second }.toIntArray()
    }
}