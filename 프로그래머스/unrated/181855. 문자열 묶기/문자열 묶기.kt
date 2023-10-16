class Solution {
    fun solution(strArr: Array<String>): Int {
        var store = IntArray (100000) { 0 }
    strArr.map { store[it.length]++ }
//    var max = -999
//    for (i in store.indices) {
//        if (store[i] > max) {
//            max = i
//        }
//    }
//    store.forEach {
//        println(it)
//    }
//    println(max)
    return store.maxOf { it }
    }
}