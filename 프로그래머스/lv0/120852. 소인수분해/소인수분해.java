import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        // 소수 : 1과 나 자신으로만 나눠지는 수
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                while(true) {
                    if(n % i != 0) break;
                    n /= i;
                }
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}