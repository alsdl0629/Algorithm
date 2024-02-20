import kotlin.math.pow
import kotlin.math.sqrt
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0

        val arr = mutableListOf<Int>()
        (1..number).forEach { i ->
            var count = 0
            val sqrt = sqrt(i.toDouble()).toInt()
            (1..sqrt).forEach { j ->
                if (i % j == 0) {
                    count++
                    val pow = j.toDouble().pow(2.0).toInt()
                    if (pow != i) count++ 
                }
            }
            arr+= count
        }

        arr.forEach { answer += if (it > limit) power else it }

        return answer
    }
}