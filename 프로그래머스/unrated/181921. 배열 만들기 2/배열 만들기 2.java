import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            int cnt = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '0' || str.charAt(j) == '5') {
                    cnt++;
                }
            }
            if(cnt == str.length()) list.add(Integer.parseInt(str));
        }
        
        if(list.size() == 0) return new int[]{-1};
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}