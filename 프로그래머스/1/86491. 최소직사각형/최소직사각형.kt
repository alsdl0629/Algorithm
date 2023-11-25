import kotlin.math.max
import kotlin.math.min
class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = -999
        var maxHeight = -999
        sizes.map {
            maxWidth = max(max(it[0], it[1]), maxWidth)
            maxHeight = max(min(it[0], it[1]), maxHeight)
        }
        return maxHeight * maxWidth
    }
}