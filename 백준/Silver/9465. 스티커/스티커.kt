import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val testCase = readLine().toInt()
    repeat(testCase) {
        val n = readLine().toInt()
        val stickers = Array(2) { IntArray(n) }
        stickers[0] = readLine().split(" ").map { it.toInt() }.toIntArray()
        stickers[1] = readLine().split(" ").map { it.toInt() }.toIntArray()

        val dp = Array(3) { IntArray(n + 1) }

        dp[0][1] = stickers[0][0]
        dp[1][1] = stickers[1][0]
        for (i in 2..n) {
            dp[0][i] = maxOf(dp[1][i - 1], dp[2][i - 1]) + stickers[0][i - 1]
            dp[1][i] = maxOf(dp[0][i - 1], dp[2][i - 1]) + stickers[1][i - 1]
            dp[2][i] = maxOf(dp[0][i - 1], dp[1][i - 1])
        }
        val max = intArrayOf(dp[0][n], dp[1][n], dp[2][n]).max()
        bw.write("$max\n")
    }
    bw.flush()
}