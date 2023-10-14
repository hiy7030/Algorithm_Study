import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        Queue<Integer> que = new LinkedList<>();

        for(int i = 0; i < answer.length; i++) {
            // que의 크기가 k이고 que에 요소 중에 score[i]보다 작은게 잇으면 삭제하고 score[i] 저장
            if(que.size()>=k) {
                for(int j = 0; j < que.size(); j++){
                    if(que.peek() < score[i]) {
                        que.remove(que.stream().mapToInt(a->a).min().getAsInt());
                        que.offer(score[i]);
                        break;
                    }
                    else que.offer(que.poll());
                }
            } else {
                que.offer(score[i]);
            }
            answer[i] = que.stream().mapToInt(a->a).min().getAsInt();
        }
        return answer;
    }
}