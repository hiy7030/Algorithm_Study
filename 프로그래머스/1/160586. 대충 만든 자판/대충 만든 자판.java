import java.util.Arrays;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i = 0; i < targets.length; i++){
            answer[i] = findNum(keymap, targets[i]);
        }

        return answer;
    }
    public int findNum(String[] keymap, String str) {
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            int[] index = new int[keymap.length];
            char c = str.charAt(i);
            for(int j = 0; j < keymap.length; j++) {
                // 각 문자의 인덱스 최소값을 더해야 함
                if(keymap[j].indexOf(c)== -1) {
                    index[j] = 101;
                } else{
                    index[j] = keymap[j].indexOf(c)+1;
                }
            }
            int min = Arrays.stream(index).min().getAsInt();
            if(min == 101) {
                sum = -1;
                break;
            } else {
                sum += min;
            }
        }
        return sum;
    }
}