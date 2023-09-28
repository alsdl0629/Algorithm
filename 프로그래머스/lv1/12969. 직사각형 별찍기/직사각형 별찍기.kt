fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    (1..b).forEach {
        (1..a).forEach {
            print("*")
        }
        println()
    }
}