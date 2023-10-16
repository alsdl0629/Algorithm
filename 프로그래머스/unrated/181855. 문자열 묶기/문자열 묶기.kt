class Solution {
    fun solution(strArr: Array<String>): Int {
        var store = IntArray (100000) { 0 }
        strArr.map { store[it.length]++ }
        return store.maxOf { it }
    }
}