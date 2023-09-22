class Solution {
    public int solution(String A, String B) {
        int answer = change(A, B, 0);
        return answer;
    }
    
    public int change(String str, String B, int cnt) {
        if(str.equals(B)) return cnt;
        if(cnt > B.length()) return -1;

        String s = String.valueOf(str.charAt(str.length()-1));
        s += str.substring(0, str.length()-1);

        return change(s, B, ++cnt);
    }
}