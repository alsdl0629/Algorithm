class Solution {
    public int solution(String s) {
        /*
          1. 첫 번째 단어를 변수에 저장
          2. 두 번째 단어부터 변수에 저장된 것과 비교
          2 - 1. 같으면 sameCnt + 1, 다르면 otherCnt
          둘의 cnt가 같아지면 끝내기
         */
        int answer = 0;
        char currentCnt = s.charAt(0);
        int sameCnt = 1;
        int otherCnt = 0;
        String tmpS = s;

        int index = 1;
        int length = s.length();
        while (index < s.length()) {
            if (currentCnt == s.charAt(index)) sameCnt++;
            else otherCnt++;

            if (sameCnt == otherCnt) {
                if (index + 1 < length) {
                    answer++;
                    currentCnt = s.charAt(++index);
                    tmpS = tmpS.substring(sameCnt + otherCnt);
                } else if (sameCnt + otherCnt == tmpS.length()) {
                    tmpS = "";
                    answer++;
                    break;
                } else break;
                sameCnt = 1;
                otherCnt = 0;
            }
            index++;
        }

        if (!tmpS.isEmpty()) answer++;

        return answer;
    }
}