fun main() = with(System.`in`.bufferedReader()) {
    when (val n = readLine().toInt()) {
        1 -> println(1)
        2 -> println(2)
        else -> {
            val dp = IntArray(n + 1)
            dp[1] = 1
            dp[2] = 2
            for (i in 3..n) dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
            println(dp[n])
        }
    }
}