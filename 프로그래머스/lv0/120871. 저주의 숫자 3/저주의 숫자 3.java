class Solution {
    public int solution(int n) {
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            int num = i + cnt;
            while (num % 3 == 0 || String.valueOf(num).contains("3")) {
                cnt++;
                num = i+cnt;
            }
        }
        int answer = cnt + n;
        return answer;
    }
}