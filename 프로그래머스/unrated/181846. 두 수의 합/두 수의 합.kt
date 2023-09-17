import java.math.BigInteger
class Solution {
    fun solution(a: String, b: String): String {
       var aa = BigInteger(a)
    var bb = BigInteger(b)
    var result = aa.plus(bb)
    return result.toString()
    }
}