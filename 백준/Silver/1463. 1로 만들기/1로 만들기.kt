import kotlin.math.min

fun problem(n: Int): Int {
    var dp = IntArray(n + 1) { 0 } // 0 ~ 10
    for (i in 2..n) { // 2 ~ 10
        dp[i] = dp[i - 1] + 1 // 1 + 1
        if (i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1)
        if (i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1)
    }
    return dp[n]
}

fun main() {
    val readln = readln()
    val problem = problem(readln.toInt())
    println(problem)
}