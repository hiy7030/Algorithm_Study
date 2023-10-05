class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        long len = t.length()-p.length();
        long pNum = Long.parseLong(p);

        for(int i = 0; i <= len; i++) {
            String str = t.substring(i, i+p.length());
            if(Long.parseLong(str) <= pNum) cnt++;
        }
        return cnt;
    }
}