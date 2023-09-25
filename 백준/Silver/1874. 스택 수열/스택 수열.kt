import java.util.Stack
fun main() {
    val readln = readln().toInt()
    var S = Stack<Int>()
    var sb = StringBuilder()
    var start = 0
    for (i in 1..readln) {
        val readln1 = readln().toInt()
        if (readln1 > start) {
            for (i in start + 1..readln1) {
                S.push(i)
                sb.append("+\n")
            }
            start = readln1
        } else if (S.peek() != readln1) {
            println("NO")
            return
        }
        S.pop()
        sb.append("-\n")
    }
    println(sb)
}