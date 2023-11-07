class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        return findOne(answer, s);
    }
    public int[] findOne(int[] answer, String s) {
        // s == 1 되면 멈춤
        // 이진 변환한 횟수와 제거된 0의 개수를 반환
        if(s.equals("1")) return answer;

        // s에 0을 제거
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            // s의 i번째 문자가 0이면 answer[1]++;
            if(s.charAt(i) == '0') {
                answer[1]++;
            } else { // 1이라면 sb.append(1);
                sb.append(s.charAt(i));
            }
        }
        // s = s.length() -> 2진법으로 변환
        int len = sb.length();

        String binary = Integer.toBinaryString(len);
        answer[0]++;

        return findOne(answer, binary);
    }
}