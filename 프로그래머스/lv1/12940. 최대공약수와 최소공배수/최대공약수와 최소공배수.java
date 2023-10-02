class Solution {
    public int[] solution(int n, int m) {
        int g = gcd(n, m);
        int l = lcm(g, n, m);

        int[] answer = new int[]{g, l};
        return answer;
    }
    public int gcd(int n, int m) {
        if(m==0) return n;
        else return gcd(m, n%m);
    }
    public int lcm(int g, int n, int m) {
        return g * (n/g) * (m/g);
    }
}