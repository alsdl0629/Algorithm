class Solution {
    fun solution(num: Int): Int {
        var answer = num
        var count = 0
        while (answer != 1) {
            if (count > 500) return -1
            if (answer % 2 == 0) answer /= 2
            else if (answer % 2 == 1) answer = answer * 3 + 1
            count++
        }
        return count
    }
}