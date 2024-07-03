import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        int sLen = s.length();
        int skipLen = skip.length();
        Set<Integer> skips = new HashSet<>();
        for (int i = 0; i < skipLen; i++) skips.add(skip.charAt(i) - 'a');

        for (int i = 0; i < sLen; i++) {
            int num = s.charAt(i) - 'a';
            int j = 0;
            while (j < index) {
                num++;
                if (num > 25) num = 0;
                int finalNum = num;
                boolean result = skips.stream().anyMatch(a -> finalNum == a);
                if (result) continue;
                else j++;
            }
            answer.append((char) (num + 'a'));
        }

        return answer.toString();
    }
}