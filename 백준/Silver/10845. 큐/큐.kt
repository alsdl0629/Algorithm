class CustomQueue<T> {
    var MAX = 10000
    var head: Int = 0
    var tail: Int = 0
    var Q = IntArray(MAX)

    fun push(element: Int) {
//        if (isFull()) {
//            throw Exception()
//        }
        Q[tail++] = element
    }

    fun pop(): Int {
        if (isEmpty()) {
            return -1
        }
        return Q[head++]
    }

    fun front(): Int {
        if (isEmpty()) {
            return -1
        }
        return Q[head]
    }

    fun back(): Int {
        if (isEmpty()) {
            return -1
        }
        return Q[tail - 1]
    }

    fun size(): Int {
        return tail - head
    }

    fun isEmpty(): Boolean {
        return head == tail
    }

    fun isFull(): Boolean {
        return tail == MAX - 1
    }
}

fun main() {
    var n = readln().toInt()
    var Q = CustomQueue<Int>()
    for (i in 1..n) {
        var str = readlnOrNull()!!.split(" ")
        when (str[0]) {
            "push" -> Q.push(str[1].toInt())
            "pop" -> println(Q.pop())
            "size" -> println(Q.size())
            "empty" -> println(if (Q.isEmpty()) 1 else 0)
            "front" -> println(Q.front())
            "back" -> println(Q.back())
        }
    }
}