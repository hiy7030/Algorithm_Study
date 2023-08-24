import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
         int length = arr.length;
        int pow = 0;

        while(length > Math.pow(2, pow)) {
            pow++;
        }

        int answerLen = (int) Math.pow(2, pow);

        int[] answer = new int[answerLen];
        answer = Arrays.copyOf(arr,answerLen);

        return answer;
    }
}