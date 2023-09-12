fun swap(arr: Array<Int>, first: Int, second: Int) {
    val t = arr[first]
    arr[first] = arr[second]
    arr[second] = t
}

fun main() {
    val (n, m) = readln().split(" ")
    val arr = Array(n.toInt()) { i -> i + 1 }
    for (i in 1..m.toInt()) {
        val (i, j) = readln().split(" ")
        swap(arr, i.toInt() - 1, j.toInt() - 1)
    }

    for (i in 0 until n.toInt()) {
        print(arr[i])
        print(" ")
    }
}