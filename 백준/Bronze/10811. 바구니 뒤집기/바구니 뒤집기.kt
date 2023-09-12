fun main() {
    var (m,n) = readln().split(" ")
    var arr = Array(m.toInt()) { i -> i + 1 }

    for (k in 0..n.toInt() - 1) {
        var (i, j) = readln().split(" ")
        arr.reverse(i.toInt() - 1, (i.toInt() - 1) + (j.toInt() - i.toInt() + 1))
    }

    print(arr.joinToString(" "))
}