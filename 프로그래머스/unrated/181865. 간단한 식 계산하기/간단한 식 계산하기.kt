class Solution {
    fun solution(binomial: String): Int {
         val split = binomial.split(' ')
    return when(split[1]) {
        "+" -> split[0].toInt() + split[2].toInt()
        "-" -> split[0].toInt() - split[2].toInt()
        else -> split[0].toInt() * split[2].toInt()
    }
    }
}