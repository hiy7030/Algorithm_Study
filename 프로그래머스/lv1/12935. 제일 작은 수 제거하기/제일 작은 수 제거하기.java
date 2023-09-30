import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int min = list.stream().mapToInt(a->a).min().getAsInt();
        list.remove(list.indexOf(min));

        int[] answer = new int[arr.length-1];

        for(int i = 0; i < answer.length; i++) {
            answer[i]=list.get(i);
        }
        return answer;
    }
}