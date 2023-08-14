class Solution {
    public int solution(int n) {
        int result = 0;
        
        if(n % 2 != 0) {
            int plus = 1;
            while(plus <= n) {
                result += plus;
                plus += 2;
            }
        } else {
            int pow = 2;
            while(pow <= n) {
                result += Math.pow(pow,2);
                pow += 2;
            }
        }
        
        return result;
    }
}