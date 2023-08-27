import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < picture.length; i++) {
            String str = picture[i];
            String newStr = "";
            for(int j = 0; j < str.length(); j++) {
                for(int l = 0; l <k; l++) {
                    newStr += str.charAt(j);
                }
            }
            for(int o = 0; o < k; o++) {
                list.add(newStr);    
            }
        }
        
        
        String [] answer = list.toArray(String[]::new);
        
        return answer;
    }
}