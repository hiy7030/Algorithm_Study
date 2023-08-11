class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // s 전 까지는 my꺼를
        for(int i = 0; i < s; i++) {
            answer += my_string.charAt(i);
        }
        
        answer += overwrite_string;
        
        if(answer.length() < my_string.length()) {
            for(int i = s+overwrite_string.length(); i < my_string.length(); i++) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}