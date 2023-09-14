class Solution {
    public int solution(String my_string) {
        String[] num = my_string.replaceAll("[a-z,A-z]", " ")
                .replaceAll("\\s+", " ")
                .trim()
                .split(" ");
        
        int answer = 0;
        
        if(num.length == 1 && num[0].equals("")) return answer;
        
        for(String s : num) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}