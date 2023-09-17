import kotlin.math.abs
import kotlin.math.pow
class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
    var arr = intArrayOf(a, b, c, d)
    val distinct = arr.distinct()
    if (distinct.count() == 1) {
        answer = 1111 * a
    } else if (distinct.count() == 2) { //
        var n1 = distinct[0] // 4 or 1
        var n2 = mutableListOf<Int>()
        arr.forEach {
            if (n1 != it) n2 += it // 4 or 1
        }
        if (n2.count() == 2) {
            answer = (n1 + n2[0]) * abs(n1 - n2[0])
        } else {
            if (n2.count() == 3) {
                answer = (10 * n2[0] + n1).toDouble().pow(2).toInt()
            } else {
                answer = (10 * n1 + n2[0]).toDouble().pow(2).toInt()
            }
        }
    } else if (distinct.count() == 3) {
        var seen = mutableSetOf<Int>()
        var a = arr.filter {  !seen.add(it) }.toList() // 6
        var n1 = a[0]
        var n2 = mutableListOf<Int>()
        arr.forEach {
            if (n1 != it) n2 += it
        }
        answer = n2[0] * n2[1]
    } else {
        arr.sort()
        answer = arr[0]
    }
    return answer
    }
}