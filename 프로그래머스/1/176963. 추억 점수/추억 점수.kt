class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        val store = mutableMapOf<String, Int>()

        name.mapIndexed { index, s ->
            store[s] = yearning[index]
        }

        photo.map { persons ->
            var score = 0
            persons.map {
                store[it]?.let { score += it }
            }
            answer += score
        }

        return answer
    }
}