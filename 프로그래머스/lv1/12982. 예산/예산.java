import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int solution(int[] d, int budget) {
        List<Integer> arr = new ArrayList<>();
        for (int e : d) {
            arr.add(e);
        }
        Collections.sort(arr);
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (budget < sum) {
                break;
            }
            answer++;
        }
        return answer;
    }
}