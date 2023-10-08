class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray) = todo_list.filterIndexed { index, s -> !finished[index] }.toTypedArray()

}