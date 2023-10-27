import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for(String s : participant) {
            if(map.containsKey(s)) map.remove(s);
            else map.put(s, 0);
        }
        for(String s: completion){
            if(map.containsKey(s)) map.remove(s);
            else map.put(s, 0);
        }
        String key = "";
        for (String s : map.keySet()) {
            key = s;
        }
        return key;
    }
}