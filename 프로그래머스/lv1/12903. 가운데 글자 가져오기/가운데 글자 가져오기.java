class Solution {
    public String solution(String s) {
        // 홀수 : s.length()/2 +1 한 위치의 문자
        // 짝수 : s.length()/2와 그 앞글자
        String answer = "";
        char[] ch = s.toCharArray();
        
        if(s.length() % 2 == 0) {
            answer += ch[s.length()/2 -1];
            answer += ch[s.length()/2];
        } else {
            answer += ch[s.length()/2];
        }
        
        return answer;
    }
}