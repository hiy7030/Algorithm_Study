class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        // num == 1 이면 0 리턴
        // num이 1이 될때까지 반복 -> 반복카운트 반환
        // 반복카운트가 500번이 넘는다면 -1
        while(n != 1) {
            if(answer == 500) {
                answer = -1;
                break;
            }
            if(n % 2 == 0) n /= 2;
            else n = n * 3 +1;
            
            answer++;
        }
        
        return answer;
    }
}