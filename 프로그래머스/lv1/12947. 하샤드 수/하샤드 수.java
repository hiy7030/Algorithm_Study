class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        // x의 모든 자리수의 합
        int sum = 0;
        String str = String.valueOf(x);
        for(int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i)-'0');
        }
        
        if(x % sum != 0) answer = false;
        
        return answer;
    }
}