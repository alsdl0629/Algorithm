import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> DQ = new ArrayDeque<>();
        for (int i = 0; i < people.length; i++) DQ.addLast(people[i]);
        while (!DQ.isEmpty()) {
            int sum = DQ.peekFirst() + DQ.peekLast();
            if (sum <= limit && DQ.size() != 1) {
                answer++;
                DQ.removeFirst();
                DQ.removeLast();
            } else {
                DQ.removeLast();
                answer++;
            }
        }
        return answer;
    }
}