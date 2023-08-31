class Solution {
    public int solution(int balls, int share) {
        return factorial(balls, share);
    }
    public static int factorial(int a, int b) {
        if(a== b || b == 0) return 1;
        return factorial((a-1), (b-1)) + factorial(a-1, b);
    }
}