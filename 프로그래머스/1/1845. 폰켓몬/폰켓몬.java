import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // nums 요소 중복 제거
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        long count = map.entrySet().stream().count();
        if (count > nums.length / 2) return nums.length / 2;
        else return (int) count;
    }
}