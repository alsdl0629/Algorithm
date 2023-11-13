class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left..right) {
            var n = 1
            var count = mutableListOf<Int>()
            while (i != n - 1) {
                if (i % n == 0) count += n
                n++
            }
            if (count.size % 2 == 0) answer += i
            else answer -= i
        }
        return answer
    }
}