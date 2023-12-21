class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
    val store = mutableMapOf<Int, Int>()

    strings.mapIndexed { index, s ->
        store[index] = s[n].code
    }
    
    return store.toList().sortedWith(compareBy({ it.second }, { strings[it.first] })).map {
        strings[it.first]
    }.toTypedArray()
}
}