class Solution {
    public int solution(int n) {
        // 6조각 
        int answer = 1;
        
        while(true) {
            if((answer * 6)%n == 0) break;
            answer++;
        }
        return answer;
    }
}