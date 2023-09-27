class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String num = sb.reverse().toString();
        
        int[] answer = new int[num.length()];
        
        for(int i = 0; i < num.length(); i++) {
            answer[i] = num.charAt(i) -'0';
        }
        
        return answer;
    }
}