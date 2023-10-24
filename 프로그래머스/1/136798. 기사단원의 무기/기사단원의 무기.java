class Solution {
    public int solution(int number, int limit, int power) {
        int sum = 0;

        for(int i = 1; i <= number; i++) {
            int div = findDiv(i);
            if(div > limit) sum += power;
            else sum += div;
        }
        return sum;
    }
    public int findDiv(int num) {
        int cnt = 0;

        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i==0) {
                cnt++;
                if(num/i != i) cnt++;
            }
        }
        return cnt;
    }
}