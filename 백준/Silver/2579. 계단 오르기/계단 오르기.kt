import kotlin.math.max

fun main() {
    var readln = readln().toInt() // 1
    var arr = IntArray(readln) { 0 } // 1
    for (i in 0 until readln) arr[i] = readln().toInt()
    if (readln == 1) {
        println(arr[0])
    } else {
        var dp = IntArray(readln + 1) { 0 } // 2
        dp[1] = arr[0]
        dp[2] = max(dp[1] + arr[1], arr[1])
        for (i in 3..readln) { // 3 ~ 6
            dp[i] = max(dp[i - 2] + arr[i - 1], dp[i - 3] + arr[i - 2] + arr[i - 1])
        }
        println(dp[dp.lastIndex])
    }
}