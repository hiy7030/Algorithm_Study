class Solution {
    public int solution(int n) {
        int[] fibo = new int[n+1];
        fibo[1] = 1 % 1234567;

        int answer = fibonacci(n, fibo);
        return answer;
    }
public int fibonacci(int n, int[] fibo) {
        if(n <= 1) return n;
        else if(fibo[n] != 0) {
            return fibo[n];
        } else {
            return fibo[n] = (fibonacci(n-1, fibo) + fibonacci(n-2, fibo))%1234567;
        }
    }
}