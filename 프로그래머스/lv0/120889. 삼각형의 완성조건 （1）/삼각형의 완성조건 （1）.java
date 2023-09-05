import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        // 가장 긴 변 < 다른 두 변의 길이의 합
        Arrays.sort(sides);
        
        int answer = 2;
        
        if(sides[2] < sides[0] + sides[1]) answer = 1;
        
        return answer;
    }
}