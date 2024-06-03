fun main() = with(System.`in`.bufferedReader()) {
    readLine().toInt()
    val arr1 = readLine().split(" ").map { it.toInt() }.sorted()
    readLine().toInt()
    val arr2 = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()

    loop@ for (i in arr2) {
        var start = 0
        var end = arr1.size - 1

        while (start <= end) {
            val mid = (start + end) / 2
            if (i == arr1[mid]) {
                sb.append("1\n")
                continue@loop
            }
            else if (i > arr1[mid]) start = mid + 1
            else if (i < arr1[mid]) end = mid - 1
        }
        sb.append("0\n")
    }
    println(sb)
}