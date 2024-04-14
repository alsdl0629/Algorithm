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
            var startHour = 0
            var startMinute = 0
            var endHour = 0
            var endMinute = 0
            for (i in 0 until size step 2) {
                if (size % 2 != 0 && i + 1 == size) {
                    carInfo.value[i].first.split(":").apply {
                        startHour = this[0].toInt()
                        startMinute = this[1].toInt()
                    }
                    endHour = 23
                    endMinute = 59
                } else {
                    carInfo.value[i].first.split(":").apply {
                        startHour = this[0].toInt()
                        startMinute = this[1].toInt()
                    }
                    carInfo.value[i + 1].first.split(":").apply {
                        endHour = this[0].toInt()
                        endMinute = this[1].toInt()
                    }
                }

                totalTime = calculateTotalTime(endHour, startHour, totalTime, endMinute, startMinute)
            }

            if (totalTime > defaultTime) {
                val ceil = ceil((totalTime - defaultTime) / unitTime) * unitMoney
                answer += Pair(carInfo.key, (defaultMoney + ceil).toInt())
            } else answer += Pair(carInfo.key, defaultMoney)
        }
        return answer.sortedBy { it.first }.map { it.second }.toIntArray()
    }

    private fun calculateTotalTime(
        endHour: Int,
        startHour: Int,
        totalTime: Double,
        endMinute: Int,
        startMinute: Int,
    ): Double {
        var result = totalTime
        if (endHour == startHour) result += endMinute - startMinute
        else if (endHour > startHour) {
            if (endMinute >= startMinute) {
                val tmpM = endMinute - startMinute
                val tmpH = (endHour - startHour) * 60
                result += tmpH + tmpM
            } else {
                val tmpM = 60 - startMinute + endMinute
                val tmpH = (endHour - startHour - 1) * 60
                result += tmpH + tmpM
            }
        }
        return result
    }
}