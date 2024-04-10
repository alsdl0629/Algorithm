import java.util.LinkedList
class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        val numbers = LinkedList<Int>()
        repeat(n) { numbers += it + 1 }
        loop@while (true) {
            var idx = 0
            if (numbers.size == 2) break@loop
            else {
                while (idx != numbers.size) {
                    if (numbers[idx] == a && numbers[idx + 1] == b
                        || numbers[idx] == b && numbers[idx + 1] == a) break@loop
                    idx += 2
                }
            }

            idx = 0
            while (numbers.size != idx) {
                if (numbers[idx] != a && numbers[idx] != b && numbers[idx + 1]  != a && numbers[idx + 1] != b) {
                    numbers.removeAt(idx)
                } // 해당 조에는 a, b가 존재하지 않음
                else if (numbers[idx] == a && numbers[idx] != b && numbers[idx + 1] != a && numbers[idx + 1] != b) {
                    numbers.removeAt(idx + 1)
                } // 앞에가 a일 때
                else if (numbers[idx] != a && numbers[idx] != b && numbers[idx + 1] == a && numbers[idx + 1] != b) {
                    numbers.removeAt(idx)
                } // 뒤가 a일 때
                else if (numbers[idx] != a && numbers[idx] == b && numbers[idx + 1] != a && numbers[idx + 1] != b) {
                    numbers.removeAt(idx + 1)
                } // 앞에가 b일 때
                else if (numbers[idx] != a && numbers[idx] != b && numbers[idx + 1] != a && numbers[idx + 1] == b) {
                    numbers.removeAt(idx)
                } // 앞에가 b일 때
                idx += 1
            }

            answer++
        }

        return answer
    }
}