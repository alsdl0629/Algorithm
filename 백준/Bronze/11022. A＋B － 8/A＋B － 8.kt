import kotlin.text.toInt
fun main() {
    val readln = readln()
    var sum = 0
    for (i in 1..readln.toInt()) {
        val (a, b) = readln().split(" ")
        sum = a.toInt() + b.toInt()
        println("Case #$i: $a + $b = $sum")
    }
}