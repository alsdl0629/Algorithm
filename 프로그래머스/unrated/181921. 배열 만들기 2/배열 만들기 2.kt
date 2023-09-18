class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
    for (i in l..r) {
        var count = 0
        i.toString().forEach {
            if (it.toString().contains("0") || it.toString().contains("5")) {
                count++
            }
        }
        if (count == i.toString().length) answer += i
    }
    if (answer.isEmpty()) answer += -1
    
    return answer
    }
}