class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            int n = food[i];
            for(int j = n/2; j > 0; j--) {
                sb.append(i);
            }
        }
        String str = sb.toString();
        String reverse = sb.reverse().toString();

        String answer = str + "0" + reverse;
        return answer;
    }
}