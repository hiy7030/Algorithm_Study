import java.util.*;
class Solution {
    public String solution(String my_string) {
        // list에 넣고 contains를 사용해서 중복 여부 확인
        List<Character> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(!list.contains(my_string.charAt(i))) {
                list.add(my_string.charAt(i));
            }
        }
        String answer = "";
        
        for(char c : list) {
            answer += c;
        }
        
        return answer;
    }
}