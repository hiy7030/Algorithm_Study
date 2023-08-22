class Solution {
    public String[] solution(String my_string) {
        
        my_string = my_string.replaceAll("\\s+", " ").trim();
        
        String[] answer = my_string.split(" ");
        return answer;
    }
}