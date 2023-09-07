import java.util.*;
class Solution {
    public String solution(String s) {
        Map<Character, Integer> map= new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);

        String answer = "";

        for(char c : cArr) {
            if(map.get(c).equals(1)) answer += c;
        }

        return answer;
    }
}