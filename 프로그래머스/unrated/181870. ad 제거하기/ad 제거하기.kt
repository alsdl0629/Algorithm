class Solution {
    fun solution(strArr: Array<String>): Array<String> =  strArr.filterNot { it.contains("ad".toRegex()) }.toTypedArray()
}