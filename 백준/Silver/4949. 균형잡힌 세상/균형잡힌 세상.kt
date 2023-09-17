import java.util.Stack
fun main() {
    while (true) {
        var isValid: Boolean = true
        val readln = readln()
        if (readln == ".") {
            break
        }
        var stack = Stack<Char>()
        readln.forEach { j->
            if (j == '(' || j == '[') {
                stack.push(j)
            } else if (j == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    isValid = false
                } else {
                    stack.pop()
                }
            } else if (j == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    isValid = false
                } else {
                    stack.pop()
                }
            }
        }
        if (!stack.empty()) isValid = false
        if (isValid) println("yes") else println("no")
    }
}