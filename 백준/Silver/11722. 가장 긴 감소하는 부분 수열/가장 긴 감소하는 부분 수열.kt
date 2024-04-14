fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numbers = IntArray(n + 1)
   readLine().split(" ").mapIndexed { index, s -> numbers[index + 1] = s.toInt() }
    val dp = IntArray(n + 1) { 1 }
    for (i in 2..n) {
        for (j in 1..i - 1) {
            if (numbers[j] > numbers[i] && dp[i] <= dp[j]) dp[i] = dp[j] + 1
        }
    }
    println(dp.max())
}