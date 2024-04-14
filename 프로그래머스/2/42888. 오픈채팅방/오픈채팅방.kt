class Solution {
    fun solution(record: Array<String>): Array<String> {
        var answer = mutableListOf<String>()
        val map = mutableMapOf<String, String>()

        record.forEach {
            val split = it.split(" ")
            when (split[0]) {
                "Enter", "Change" -> {
                    if (map[split[1]] != null) {
                        map.remove(split[1])
                        map[split[1]] = split[2]
                    }
                    else map[split[1]] = split[2]
                }
            }

        }

        record.forEach {
            val split = it.split(" ")
            when(split[0]) {
                "Enter" -> answer.add("${map[split[1]]}님이 들어왔습니다.")
                "Leave" -> answer.add("${map[split[1]]}님이 나갔습니다.")
            }
        }
        return answer.toTypedArray()
    }
}