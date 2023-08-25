import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for(int x : arr) {
            list.add(x);
        }

        for(int x : delete_list) {
            int idx = list.indexOf(x);

            if(idx != -1) {
                list.remove(idx);
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}