import kotlin.text.toInt
fun main() {
    val (n, m) = readln().split(" ")
    val arr = Array(n.toInt()) { 0 }
    for (i in 1..m.toInt()) {
        val (i, j, k) = readln().split(" ")
        for (a in i.toInt() - 1 until j.toInt()) {
            arr[a] = k.toInt()
        }
    }

    for (i in 0 until n.toInt()) {
        print(arr[i])
        print(" ")
    }
}