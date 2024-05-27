fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = readLine().split(" ")
        .map { it.toInt() }
        .sorted()
        .toIntArray()

    var result = 0
    arr.forEachIndexed { index, _ ->
        var sum = 0
        for (i in 0..index) sum += arr[i]
        result += sum
    }
    println(result)
}