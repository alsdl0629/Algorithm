import java.time.LocalDate
class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer = 0
    val localDate1 = LocalDate.of(date1[0], date1[1], date1[2])
    val localDate2 = LocalDate.of(date2[0], date2[1], date2[2])
    if (localDate1.isBefore(localDate2)) answer = 1
    return answer
    }
}