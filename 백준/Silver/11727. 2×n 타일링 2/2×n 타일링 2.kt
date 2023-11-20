fun main() {
    val readln = readln().toInt()
    if (readln == 1) {
        println(1)
    } else if (readln == 2) {
        println(3)
    } else {
        var dp = IntArray(readln + 1) { 0 }
        dp[0] = 0
        dp[1] = 1
        dp[2] = 3
        for (i in 3..readln) {
            dp[i] = (dp[i - 1] + dp[i - 2]  * 2) % 10007
        }
        println(dp[readln])
    }
}