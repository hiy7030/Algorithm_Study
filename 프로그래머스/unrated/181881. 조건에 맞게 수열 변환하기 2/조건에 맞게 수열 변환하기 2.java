import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
      int answer = 0;

        int[] first = Arrays.copyOf(arr, arr.length);
        int[] next = new int[arr.length];

        while (true){
            for(int i = 0; i < first.length; i++) {
                if(first[i] >= 50 && first[i] % 2 == 0) {
                    next[i] = first[i] / 2;
                } else if(first[i] < 50 && first[i] % 2 != 0) {
                    next[i] = (first[i] * 2 ) + 1;
                } else {
                    next[i] = first[i];
                }
            }

            if(Arrays.equals(first, next)) {
                break;
            }

            first = Arrays.copyOf(next, next.length);
            answer++;
        }

        return answer;
    }
}