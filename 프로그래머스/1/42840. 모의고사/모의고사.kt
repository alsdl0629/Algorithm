class Solution {
    fun solution(answers: IntArray): IntArray {
        val counts = mutableListOf(0, 0, 0)
        val person1 = mutableListOf(1, 2, 3, 4, 5)
        val person2 = mutableListOf(2, 1, 2, 3, 2, 4, 2, 5)
        val person3 = mutableListOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        answers.mapIndexed { index, i ->
            if (i == person1[index % person1.size]) counts[0]++
            if (i == person2[index % person2.size]) counts[1]++
            if (i == person3[index % person3.size]) counts[2]++
        }
        val answer = mutableListOf<Int>()
        for (i in counts.indices) {
            if (counts[i] == counts.maxOrNull()) answer.add(i + 1)
        }

        return answer.toIntArray()
    }
}