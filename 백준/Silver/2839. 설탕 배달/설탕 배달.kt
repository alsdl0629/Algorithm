fun main() {
    val n = readln().toInt()

    var cnt = 0
    var tmp = 0
    while (true) {
        if (tmp == n) {
            println(cnt)
            return
        } else if (tmp + 5 <= n && (n - tmp) % 5 == 0) {
            tmp += 5
        } else if (tmp + 3 <= n || (n - tmp) % 3 == 0) {
            tmp += 3
        }  else {
            println(-1)
            return
        }
        cnt++
    }
}