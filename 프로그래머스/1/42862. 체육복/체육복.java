import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] check = new boolean[n+1];
        check[0] = true;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++){
                // 여분이 잇는데 도단당했어=> 빌ㄹ려줄수없음
                if(lost[i]==reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for(int i = 0; i < lost.length; i++) {
            if(lost[i]==-1)continue;
            int cnt = 0;
            for(int j = 0; j < reserve.length; j++){
                if(reserve[j] == -1) continue;
                if(Math.abs(lost[i]-reserve[j])==1) {
                    reserve[j] = -1;
                    cnt++;
                    break;
                }
            }
            if(cnt == 0) check[lost[i]] = true;
        }
        int answer = 0;

        for(boolean b : check) {
            if(!b) answer++;
        }
        return answer;
    }
}