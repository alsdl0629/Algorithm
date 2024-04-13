fun main() = with(System.`in`.bufferedReader()) {
    val dp = IntArray(11)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for (i in 4..10) dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]

    val n = readLine().toInt()
    val sb = StringBuilder()
    for (i in 1..n) {
        val input = readLine().toInt()
        sb.append("${dp[input]}").append("\n")
    }
    println(sb)
}