import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int answer = nums.length/2;
        if(map.size() >= answer) return answer;
        else return map.size();
    }
}