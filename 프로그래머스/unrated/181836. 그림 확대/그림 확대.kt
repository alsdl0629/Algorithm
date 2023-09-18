class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
    for (i in 0 .. picture.size - 1) {
        var str = ""
        picture[i].forEach {
            str += it.toString().repeat(k)
        }
        for (j in 1 .. k) answer += str
    }
    return answer
    }
}