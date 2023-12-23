class Solution {
    fun solution(a: Int, b: Int) = when (a) {
        1 -> day(b)
        2 -> day(31 + b)
        3 -> day(60 + b)
        4 -> day(91 + b)
        5 -> day(121 + b)
        6 -> day(152 + b)
        7 -> day(182 + b)
        8 -> day(213 + b)
        9 -> day(244 + b)
        10 -> day(274 + b)
        11 -> day(305 + b)
        else -> day(335 + b)
    }


    private fun day(n: Int): String {
        val i = (n - 1) % 7
        return when (i) {
            0 -> "FRI"
            1 -> "SAT"
            2 -> "SUN"
            3 -> "MON"
            4 -> "TUE"
            5 -> "WED"
            else -> "THU"
        }
    }
}