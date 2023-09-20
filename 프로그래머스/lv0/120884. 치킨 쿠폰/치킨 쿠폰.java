class Solution {
    public int solution(int chicken) {
        return count(chicken, 0);
    }
    public int count(int chicken, int result) {
        if(chicken < 10) return result;
        
        result += chicken /10;
        chicken = (chicken/10) + (chicken%10);
        
        return count(chicken, result);
    }
}