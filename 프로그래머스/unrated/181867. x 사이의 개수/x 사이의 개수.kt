class Solution {
    fun solution(myString: String): IntArray {
    var answer: IntArray = intArrayOf()
    var count = 0
    myString.forEach {
        if (it != 'x') count++
        else {
            answer += count
            count = 0
        }
    }
    answer += count
    return answer
}
}