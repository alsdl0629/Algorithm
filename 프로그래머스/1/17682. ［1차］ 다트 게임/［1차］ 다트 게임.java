class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int index = -1;
        int[] score = new int[3];
        String[] dart = dartResult.split("");
        for (int i = 0; i < dart.length; i++) {
            if (dart[i].matches("^[0-9]*$")) {
                index++;
                score[index] = Integer.parseInt(dart[i]);
                if (dart[i + 1].matches("^[0-9]*$")) {
                    score[index] = 10;
                    i++;
                }
            }
            switch (dart[i]) {
                case "D":
                    score[index] = score[index] * score[index];
                    break;
                case "T":
                    score[index] = score[index] * score[index] * score[index];
                    break;
                case "*":
                    score[index] *= 2;
                    if (index - 1 >= 0) score[index - 1] *= 2;
                    break;
                case  "#":
                    score[index] *= -1;
                    break;
            }
        }
        for (int i : score) {
            answer += i;
        }
        return answer;
    }
}