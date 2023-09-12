fun main() {
    val arr = Array(42) { 0 }

    for (i in 0..9) {
        val readln = readln().toInt()
        val idx = readln % 42
        arr[idx] = 1
    }

    var count = 0
    for (i in 0..41) {
        if (arr[i] == 1) {
            count++
        }
    }
    println(count)
}