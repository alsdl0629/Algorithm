fun main() {
    val input = readlnOrNull()!!.split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val c = input[2].toInt()

    println((a + b) % c)
    println(((a % c) + (b % c)) % c)
    println((a * b) % c)
    println((a % c) * (b % c) % c)
}