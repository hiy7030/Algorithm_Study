import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        // 2의 값을 가진 index 값을 저장 -> 맨앞에 인덱스 맨 뒤 인덱스
        Integer[] integers = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);

        int start = Arrays.asList(integers).indexOf(2);
        int end = Arrays.asList(integers).lastIndexOf(2);

        if(start == end && start == -1) list.add(-1);
        else if(start == end && start != -1) list.add(arr[start]);
        else {
            for(int i = start; i <= end; i++) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;

    }
}