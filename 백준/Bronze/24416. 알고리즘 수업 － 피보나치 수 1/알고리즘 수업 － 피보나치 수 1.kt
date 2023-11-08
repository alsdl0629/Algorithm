fun fib(n: Int): Int {
    if (n == 1 || n == 2) {
        return 1
    }
    return fib(n - 1) + fib(n - 2)
}

fun fibonacci(n: Int): Int {
    var arr = IntArray(n + 1)
    arr[1] = 1
    arr[2] = 1
    var couunt = 0
    for (i in 3 .. n) {
        couunt++
        arr[i] = arr[i - 1] + arr[i -2]
    }
    return couunt
}

fun main() {
    val readln = readln()
    println("${fib(readln.toInt())} ${fibonacci(readln.toInt())}")
}