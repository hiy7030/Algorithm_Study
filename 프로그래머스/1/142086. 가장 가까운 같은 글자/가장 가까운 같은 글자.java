class Solution {
    public int[] solution(String s) {
        boolean[] abc = new boolean[26];
        int[] answer = new int[s.length()];

        for(int i = 0; i < answer.length; i++) {
            char ch = s.charAt(i);
            int idx = ch-97;
            // 97빼기
            if(abc[idx]) {
                // 가까운 문자 찾기 -> 자기 인덱스부터 0까지 순회하면서 같은 문자 찾기
                answer[i] = findIndex(i,ch,s);
            } else {
                answer[i] = -1;
                abc[idx] = true;
            }
        }
        return answer;
    }
    public int findIndex(int idx, char ch, String s) {
        int cnt = 1;
        for(int i = idx-1; i >= 0; i--) {
            if(s.charAt(i) == ch) break;
            else cnt++;
        }
        return cnt;
    }
}