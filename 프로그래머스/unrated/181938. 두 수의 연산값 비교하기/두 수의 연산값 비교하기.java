class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int ab2 = 2 * a * b;
        
        return Math.max(ab, ab2);
    }
}