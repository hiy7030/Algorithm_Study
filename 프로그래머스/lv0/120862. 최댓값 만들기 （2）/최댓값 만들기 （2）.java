import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        // 가장 작은 값 두개의 곱과, 가장 큰 값 두개의 곱을 비교해서 큰 값 리턴
        int min = numbers[0] * numbers[1];
        int max = numbers[numbers.length-2] * numbers[numbers.length-1];
        
        return Math.max(min, max);
    }
}