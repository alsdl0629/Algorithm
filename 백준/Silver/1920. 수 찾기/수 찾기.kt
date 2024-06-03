fun main() = with(System.`in`.bufferedReader()) {
    readLine().toInt()
    val arr1 = readLine().split(" ").map { it.toInt() }.toSet()
    readLine().toInt()
    val arr2 = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()

    arr2.forEach {
        if (arr1.contains(it)) sb.append("1\n") else sb.append("0\n")
    }
    println(sb)
}