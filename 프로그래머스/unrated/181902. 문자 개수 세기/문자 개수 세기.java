class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        // A(65)-Z(90) : -65, a(97)-z(122) : -71
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(65 <= c && c <= 90) {
                answer[c-65]++;
            } else {
                answer[c-71]++;
            }
        }
        
        return answer;
    }
}