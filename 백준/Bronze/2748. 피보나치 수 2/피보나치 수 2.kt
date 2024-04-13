fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n == 1) println(1)
    else if (n == 2) println(1)
    else {
        val arr = LongArray(n + 1)
        arr[1] = 1
        arr[2] = 1
        for (i in 3 .. n) arr[i] = arr[i - 1] + arr[i - 2]
        println(arr[n])
    }
}