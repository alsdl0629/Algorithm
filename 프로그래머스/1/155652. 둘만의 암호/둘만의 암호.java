class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int num = s.charAt(i) - 'a';
            int j = 0;
            while (j < index) {
                num = num >= 25 ? 0 : num + 1;
                if (!skip.contains(String.valueOf((char) (num + 'a')))) j++;
            }
            answer.append((char) (num + 'a'));
        }

        return answer.toString();
    }
}