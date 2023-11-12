fun main() {
    var dp = IntArray( 11) { 0 }
    dp[1] = 1
    dp [2] = 2
    dp[3] = 4
    for (i in 4..10) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }

    val testCase = readln().toInt()
    for (i in 1..testCase) {
        val n = readln().toInt()
        println(dp[n])
    }
}