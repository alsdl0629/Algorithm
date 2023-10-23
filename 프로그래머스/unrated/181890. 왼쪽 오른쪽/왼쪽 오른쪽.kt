class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var stop = IntArray (2) {-1}
        for (i in str_list.indices) {
            if (str_list[i] == "l") {
                stop[0] = i
                break
            }
            else if (str_list[i] == "r") {
                stop[1] = i
                break
            }
        }
        if (stop[0] != -1) {
            for (i in 0..stop[0] - 1) answer += str_list[i]
        } else if (stop[1] != -1) {
            for (i in stop[1] + 1..str_list.size - 1) answer += str_list[i]
        }
        return answer
    }
}