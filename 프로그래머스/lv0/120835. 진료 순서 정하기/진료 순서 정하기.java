import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        // 순회하면서 자기보다 큰 값이 있을 때마다 해당 인덱스의 값을 ++
        int[] answer = new int[emergency.length];
        Arrays.fill(answer, 1);
        
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer.length; j++) {
                if(emergency[i] < emergency[j]) answer[i]++;
            }
        }
        
        return answer;
    }
}