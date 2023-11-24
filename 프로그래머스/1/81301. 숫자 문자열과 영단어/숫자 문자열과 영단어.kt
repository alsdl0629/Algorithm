class Solution {
    fun solution(s: String): Int {
        var answer: String = ""
        var store = ""
        s.map {
            if (it.code in 48..57) answer += it
            else {
                store += it
                when (store) {
                    "zero" -> {
                        answer += 0
                        store = ""
                    }
                    "one" -> {
                        answer += 1
                        store = ""
                    }
                    "two" -> {
                        answer += 2
                        store = ""
                    }
                    "three" -> {
                        answer += 3
                        store = ""
                    }
                    "four" -> {
                        answer += 4
                        store = ""
                    }
                    "five" -> {
                        answer += 5
                        store = ""
                    }
                    "six" -> {
                        answer += 6
                        store = ""
                    }
                    "seven" -> {
                        answer += 7
                        store = ""
                    }
                    "eight" -> {
                        answer += 8
                        store = ""
                    }
                    "nine" -> {
                        answer += 9
                        store = ""
                    }
                }
            }
        }
        return answer.toInt()
}
}