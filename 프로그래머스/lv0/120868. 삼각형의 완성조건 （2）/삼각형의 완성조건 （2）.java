class Solution {
    public int solution(int[] sides) {
        // 가장 긴 변 < 나머지 변의 합
        // sides에서 가장 큰 값이 가장 긴 변이 되는 경우 
            // sides[i](max) < sides[j](min) + new
            // max - min < new
       // 새로 찾는 값이 가장 긴변이 되는 경우
            // new < max + min
        
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
  
        // max - min < new < max + min -> (max+min) - (max-min) - 1
        int answer = (max+min) - (max-min) -1;
        
        return answer;
    }
}