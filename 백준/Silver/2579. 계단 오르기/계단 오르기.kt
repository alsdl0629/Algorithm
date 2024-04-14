fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stair = IntArray(301)
    for (i in 1..n) stair[i] = readLine().toInt()
    val dp = IntArray(301)
    dp[1] = stair[1]
    dp[2] = stair[1] + stair[2]
    dp[3] = maxOf(stair[1] + stair[3], stair[2] + stair[3])
    if (n <= 3) println(dp[n])
    else {
        for (i in 4..n) {
            val current = stair[i]
            dp[i] = maxOf(dp[i - 3] + stair[i - 1] + current, dp[i - 2] + current)
        }
        println(dp[n])
    }
}