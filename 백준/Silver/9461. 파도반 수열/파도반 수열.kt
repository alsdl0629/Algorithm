fun main() {
    val readln = readln().toInt()
    var dp = LongArray(101) { 0 }
    dp[1] = 1
    dp[2] = 1
    dp[3] = 1
    dp[4] = 2
    dp[5] = 2
    for (i in 0 until readln) {
        val readln1 = readln().toInt()
        for (i in 6..readln1) {
            dp[i] = dp[i - 1] + dp[i - 5]
        }
        println(dp[readln1])
    }
}