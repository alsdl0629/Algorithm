import java.util.LinkedList
import java.util.Queue
fun main() {
    var n = readln().toInt()
    var Q: Queue<Int> = LinkedList()
    val sb = StringBuilder()
    for (i in 1..n) {
        var str = readlnOrNull()!!.split(" ")
        when (str[0]) {
            "push" -> Q.add(str[1].toInt())
            "pop" -> if (Q.isEmpty()) sb.append("-1\n") else sb.append("${Q.poll()}\n")
            "size" -> sb.append("${Q.size}\n")
            "empty" -> if (Q.isEmpty()) sb.append("1\n") else sb.append("0\n")
            "front" -> if (Q.isEmpty()) sb.append("-1\n") else sb.append("${Q.first()}\n")
            "back" -> if (Q.isEmpty()) sb.append("-1\n") else sb.append("${Q.last()}\n")
        }
    }
    println(sb)
}