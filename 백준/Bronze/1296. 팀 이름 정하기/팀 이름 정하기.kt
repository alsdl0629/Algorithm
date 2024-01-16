fun main() {
    val yeondoName = readln()
    val list = mutableListOf<Pair<String, Int>>()
    val n = readln().toInt()
    for (i in 1..n) {
        val teamName = readln()
        val score = IntArray(4) { 0 }
        yeondoName.forEach {
            when(it) {
                'L' -> score[0]++
                'O' -> score[1]++
                'V' -> score[2]++
                'E' -> score[3]++
            }
        }
        teamName.forEach {
            when(it) {
                'L' -> score[0]++
                'O' -> score[1]++
                'V' -> score[2]++
                'E' -> score[3]++
            }
        }
        val result =
            ((score[0] + score[1]) * (score[0] + score[2]) * (score[0] + score[3]) * (score[1] + score[2]) * (score[1] + score[3]) * (score[2] + score[3])) % 100
        list += Pair(teamName, result)
    }

    var max = -99999
    val maxList = mutableListOf<Pair<String, Int>>()
    list.map {
        if (it.second >= max) {
            maxList += it
            max = it.second
        }
    }

    maxList.sortWith(compareByDescending { it.second })
    val b = maxList.filter { it.second == maxList.maxOf { it.second } }
        .map { it.first }
        .toMutableList()
    b.sort()
    println(b.first())
}