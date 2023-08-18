class Solution {
    public String solution(String my_string, int s, int e) {
        String start = my_string.substring(0, s);
        String end = my_string.substring(e+1);
        
        String str = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        
        String result = start + reverse + end;
        return result;
    }
}