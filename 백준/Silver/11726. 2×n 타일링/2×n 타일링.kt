fun main() {
    val readln = readln().toInt()
    var dp = IntArray(readln + 1) { 0 }
    if (readln == 1) {
        println(1)
    } else if (readln == 2) {
        println(2)
    } else {
        dp[1] = 1
        dp[2] = 2
        for (i in 3..readln) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
        }
        println(dp[readln])
    }
}