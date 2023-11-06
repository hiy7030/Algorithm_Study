import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] score = new int[]{0,3,2,1,0,1,2,3};

        // map에 넣고, RT, FC, MJ, AN의 값을 각각 비교하여 더 큰값을 적용
        // 값이 같은 경우 사전순으로 빠른 쪽 ( R, C, J, A)을 적용
        Map<Character, Integer> map = new HashMap<>();
        String str = "RTFCMJAN";
        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), 0);
        }

        for(int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            if(1 <= choice && choice <= 3) {
                char c = survey[i].charAt(0);
                map.put(c, map.getOrDefault(c, 0)+score[choice]);
            } else if(5<= choice && choice <= 7) {
                char c = survey[i].charAt(1);
                map.put(c, map.getOrDefault(c, 0)+score[choice]);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(map.get('R')>=map.get('T')? 'R' : 'T');
        sb.append(map.get('C')>=map.get('F')? 'C' : 'F');
        sb.append(map.get('J')>=map.get('M')? 'J' : 'M');
        sb.append(map.get('A')>=map.get('N')? 'A' : 'N');

        return sb.toString();
    }
}