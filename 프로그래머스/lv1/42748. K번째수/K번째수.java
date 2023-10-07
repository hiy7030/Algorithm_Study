import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // commands의 길이만큼 수행
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int result = fun(array, commands[i]);
            answer[i] = result;
        }
        return answer;
    }
    public int fun(int[] array, int[] c) {
        int i = c[0];
        int j = c[1];
        int k = c[2];
        // array를 i~j까지 자른다. -> i-1 부터 j까지
        int[] arr = Arrays.copyOfRange(array, i-1, j);
        Arrays.sort(arr);
        // arr에서 k번쨰 숫자 -> idx = k-1;
        return arr[k-1];
    }
}