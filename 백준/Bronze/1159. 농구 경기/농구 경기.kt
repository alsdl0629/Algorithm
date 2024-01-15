fun main() {
    val n = readln().toInt()
    val players = IntArray(26) { 0 }

   for (i in 0 until n) {
       val input = readln()
       val firstName = input[0]
       players[firstName - 'a']++
   }

    var sb = StringBuilder()
    players.mapIndexed { index, i ->
        if (i >= 5) sb.append((index + 97).toChar())
    }

    if (sb.isNotBlank()) println(sb.toString()) else println("PREDAJA")
}