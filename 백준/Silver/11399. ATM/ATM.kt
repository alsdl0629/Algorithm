fun main() = with(System.`in`.bufferedReader()) {
    readLine().toInt()
    val arr = readLine().split(" ")
        .map { it.toInt() }
        .sorted()
        .toIntArray()

    var result = 0
    var tmp = 0
    arr.forEachIndexed { index, _ ->
        tmp += arr[index]
        result += tmp
    }
    println(result)
}