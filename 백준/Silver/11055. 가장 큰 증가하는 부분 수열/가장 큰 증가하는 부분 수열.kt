import kotlin.math.max

fun main() {
    val a = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.toIntArray()
    val dp = IntArray(a + 1)
    for (i in 0 until a) dp[i + 1] = arr[i]
    var max = -999
    for (i in 1..a) {
        for (j in 0 until i - 1) {
            if (arr[i - 1] > arr[j]) dp[i] = max(dp[i], dp[j + 1] + arr[i - 1])
        }
        max = max(max, dp[i])
    }
    println(max)
}