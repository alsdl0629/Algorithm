import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> remainLottos = new ArrayList<>();
        for (int i : lottos) {
            remainLottos.add(i);
        }

        int[] result = new int[2];
        int count = 0;
        for (int i : win_nums) {
            if (remainLottos.contains(i)) {
                count++;
                remainLottos.remove(Integer.valueOf(i));
            }
        }
        result[1] = getRank(count);

        for (int i : remainLottos) {
            if (i == 0) count++;
        }

        result[0] = getRank(count);

        return result;
    }
    
    private int getRank(int count) {
        int result = 0;
        switch (count) {
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            default: result = 6;
        }
        return result;
    }
}