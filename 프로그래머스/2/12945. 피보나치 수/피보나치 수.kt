class Solution {
    fun solution(n: Int): Int {
        if (n == 2) return 1
        else if (n == 3) return 2
        else {
            var dp = IntArray(n + 1)
            dp[0] = 0
            dp[1] = 1
            dp[2] = 1
            dp[3] = 2
            for (i in 4..n) dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
            return dp[n]
        }
    }
}