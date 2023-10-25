import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
         List<double[]> list = new ArrayList<>();
        // 1번 스테이지 : 1번과 같은 값을 가진 수 /stage 전체 길이
        // 2번 스테이지 : 2번과 같은 값을 가진 수 / stage.length - 1번 카운트

        // i~n만큼 반복하는데
        // i와 stage에 같은 값을 가진 것을 카운팅 한다.
        // 실패율을 구해 list에 저장한다.
        // 이전 카운팅한 것을 before에 저장하고
        // 카운팅은 다시 0으로 초기화
        int before = 0;
        for(int i = 1; i <= N; i++) {
            int cnt = 0;
            for(int j = 0; j < stages.length; j++) {
                if(i==stages[j]) cnt++;
            }
            if(stages.length-before == 0) {
                list.add(new double[]{i, 0.0});
            } else {
                list.add(new double[]{i,(double) cnt/(stages.length-before)});
            }
            before += cnt;
        }

        Collections.sort(list, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if(o1[1] == o2[1]) return 0;
                else return Double.compare(o2[1], o1[1]);
            }
        });

        int[] answer = new int[N];

        for(int i = 0; i < N; i++) {
            answer[i] = (int)list.get(i)[0];
        }
        return answer;
    }
}