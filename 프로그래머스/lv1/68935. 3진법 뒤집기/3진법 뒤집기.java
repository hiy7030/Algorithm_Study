import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();

        while (true) {
            if(n==0) {
                break;
            }
            list.add(n%3);
            n /= 3;
        }
        int answer = 0;
        int cnt = 0;

        for(int i = list.size()-1; i >= 0; i--) {
            double pow = Math.pow(3, cnt);
            answer += list.get(i) * pow;
            cnt++;
        }
        return answer;
    }
}