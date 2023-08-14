class Solution {
    public int solution(int a, int b) {
        int firstA = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int firstB = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
                                      
        return Math.max(firstA, firstB);
    }
}