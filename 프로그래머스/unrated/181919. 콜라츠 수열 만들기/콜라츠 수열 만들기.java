import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        list = repeat(list, n);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    public List<Integer> repeat(List<Integer> list, int x) {
        if(x == 1) return list;
        
        if(x % 2 == 0) {
            x /= 2;
            list.add(x);
        } else {
            x = 3*x+1;
            list.add(x);
        }
        return repeat(list, x);
    }
}