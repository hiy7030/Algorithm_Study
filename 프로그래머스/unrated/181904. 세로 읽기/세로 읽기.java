import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> list = new ArrayList<>();
        // 0, m -> m, m+m -> m+m, m+m+m
        for(int i = 0; i < my_string.length()-m+1; i+=m) {
            int tmp = i+m;
            String str = my_string.substring(i, tmp);
            list.add(str);
        }
        String answer = "";

        for(String s : list) {
            answer += s.charAt(c-1);
        }
        return answer;
    }
}