import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> S = new Stack<>();
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(') S.push(s.charAt(i));
            else if (s.charAt(i) == ')') {
                if (S.empty() || S.peek() != '(') answer = false;
                else S.pop();
            }
        }
        if (!S.empty()) answer = false;
        return answer;
    }
}