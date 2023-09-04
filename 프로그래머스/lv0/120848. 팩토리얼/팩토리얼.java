class Solution {
    public int solution(int n) {
        // 10부터 시작
        // 팩토리얼 값을 찾는다 -> for문
        // if 팩토리얼 값 <= n
        int answer = 0;
        
        for(int i = 10; i >= 1; i--) {
            int result = 1;
            for(int j = 1; j <= i; j++) {
                result *= j;
            }
            if(result <= n) answer = Math.max(answer, i);
        }
    return answer;
    }
}