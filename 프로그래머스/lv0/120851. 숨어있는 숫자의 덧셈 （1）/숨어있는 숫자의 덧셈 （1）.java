class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[a-z,A-z]", "");
        
        int answer = 0;
        
        for(int i = 0; i < str.length(); i++) {
            answer+= (str.charAt(i) - '0');
        }
        
        return answer;
    }
}