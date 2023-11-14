class Solution {
    fun solution(polynomial: String): String {
    var length = polynomial.length
    var idx = 0
    var value = 0
    var num = 0
    while (length != 0 && idx < polynomial.length) {
        --length
        if (polynomial[idx] == ' ' || polynomial[idx] == '+') {
            idx++
            continue
        } else if (polynomial[idx] == 'x') {
            value++
        }
        else if (polynomial[idx].digitToInt() in 1..9) {
            if (idx + 1 != polynomial.length && polynomial[idx + 1] == 'x') {
                value += polynomial[idx].digitToInt()
                idx++
            } else if (idx + 1 != polynomial.length && polynomial[idx + 1] != ' ' && polynomial[idx + 1].digitToInt() in 0..9) {
                if (idx + 2 != polynomial.length && polynomial[idx + 2] != ' ' && polynomial[idx + 2] == 'x') {
                    value += "${polynomial[idx]}${polynomial[idx + 1]}".toInt()
                    idx++
                } else {
                    num += "${polynomial[idx]}${polynomial[idx + 1]}".toInt()
                }
                idx++
            } else {
                num += polynomial[idx].digitToInt()
            }
        }
        idx++
    }
    return if (value == 0) {
        "$num"
    } else if (value == 1) {
        if (num == 0) {
            "x"
        } else {
            "x + $num"
        }
    } else {
        if (num == 0) {
            "${value}x"
        }
        else {
            "${value}x + $num"
        }
    }
}
}