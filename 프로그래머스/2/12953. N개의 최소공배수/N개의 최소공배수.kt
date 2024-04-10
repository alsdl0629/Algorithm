class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr.maxOrNull()!!
        val check = BooleanArray(arr.size) { false }
        while (true) {
            if (check.all { it }) break
            else {
                check.forEachIndexed { index, _ -> check[index] = false }
            }

            answer++
            arr.forEachIndexed { index, value ->
                if (answer % value == 0) check[index] = true
            }
        }
        return answer
    }
}