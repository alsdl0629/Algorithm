class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    var answer: IntArray = intArrayOf()
    // 신고한 유저 - 신고 당한 유저
    val reportId = HashMap<String, MutableSet<String>>()

    // 신고 당한 유저 - 신고 당한 횟수
    val reportCount = HashMap<String, Int>()

    // reportCount 초기화
    id_list.map {
        val split = it.split(" ")
        reportCount[split[0]] = 0
    }

    // reportId 초기화
    report.map {
        val split = it.split(" ")
        if (reportId[split[0]] != null) {
            reportId[split[0]]!!.add(split[1])
        } else {
            reportId[split[0]] = mutableSetOf(split[1])
        }
    }

    // 신고 당한 횟수 저장
    reportId.map { userId ->
        userId.value.map {
            val count = reportCount[it]!!
            reportCount[it] = count + 1
        }
    }

    // 정지 당한 유저 수 반환
    id_list.map { userId ->
        var count = 0
        reportId[userId]?.map {
            if (reportCount[it]!! >= k) count++
        }
        answer += count
    }
    return answer
}
}