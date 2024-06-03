fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)
    readLine().split(" ").forEachIndexed { index, s ->
        if (index != 0) arr[index] = arr[index - 1] + s.toInt()
        else arr[index] = s.toInt()
    }
    val sb = StringBuilder()

    repeat(m) {
        val (i, j) = readLine().split(" ").map { it.toInt() }
        val result = if (i - 2 < 0) arr[j - 1]
        else arr[j - 1] - arr[i - 2]
        sb.append(result).append("\n")
    }
    println(sb)
}