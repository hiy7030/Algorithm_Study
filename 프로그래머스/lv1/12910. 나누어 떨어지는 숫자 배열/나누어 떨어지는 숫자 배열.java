import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        Collections.sort(list);
        int[] answer = {};
        
        if(list.size() > 0) {
            answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }
        else answer = new int[]{-1};
        
        return answer;
    }
}