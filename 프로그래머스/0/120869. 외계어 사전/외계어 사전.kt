class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        loop@for (aliensLang in dic) {
            var tmp = aliensLang
            for (engLang in spell)
                if (tmp.isEmpty()) continue@loop
                else if (tmp.contains(engLang)) {
                    val index = tmp.indexOf(engLang)
                    tmp = tmp.removeRange(index..index)
                } else continue@loop
            if (tmp.isEmpty()) return 1
        }
        return 2
    }
}