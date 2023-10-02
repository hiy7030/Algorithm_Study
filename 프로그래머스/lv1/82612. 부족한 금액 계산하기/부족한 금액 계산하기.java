class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i = 1; i <= count; i++) {
            int p = price * i;
            answer += p;
        }
        
        if(money >= answer) return 0;
        else return answer-money;
    }
}