class Solution {
    public int solution(int a, int b) {
        int answer = 2;

        // a와 b의 최대공약수를 찾아서 나누기
        int max = 0;
        for(int i = 1; i <= Math.max(a,b); i++) {
            if(a%i==0&&b%i==0) max = i;
        }

        double m = (b / max);

        for(int i = 2; i <= 5; i+=3){
            while(m%i == 0) {
                m /= i;
            }
        }

        if(m == 1) answer = 1;


        return answer;
    }
}