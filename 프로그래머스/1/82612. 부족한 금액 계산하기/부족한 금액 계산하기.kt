class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for (i in 1..count) answer += price * i
        return if (answer >= money) answer - money else 0
    }
}