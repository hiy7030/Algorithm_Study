import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] answers) {
        Queue<Integer> q1 = new LinkedList<>(List.of(1,2,3,4,5));
        Queue<Integer> q2 = new LinkedList<>(List.of(2,1,2,3,2,4,2,5));
        Queue<Integer> q3 = new LinkedList<>(List.of(3,3,1,1,2,2,4,4,5,5));


        int[] score = new int[3];

        for(int n : answers) {
            // que 각각의 처음의 값을 뺴서 비교 후 뒤로 넣기
            // 값이 같다면 score++
            if(check(q1, n)) score[0]++;
            if(check(q2, n)) score[1]++;
            if(check(q3, n)) score[2]++;
        }

        // 최고점 찾기
        int max = 0;
        for(int s : score) {
            max = Math.max(max, s);
        }

        // 최고점과 같은 점수인 사람 찾기 - list에 넣기
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(score[i] == max) list.add(i+1);
        }
        // 배열로 변환 후 반환
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
    public boolean check (Queue<Integer> que, int n) {
        boolean boo = false;

        int poll = que.poll();

        if(poll == n) boo = true;
        que.offer(poll);

        return boo;
    }
}