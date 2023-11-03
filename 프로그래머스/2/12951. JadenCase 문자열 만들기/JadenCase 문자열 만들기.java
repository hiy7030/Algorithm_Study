class Solution {
    public String solution(String s) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(cnt==0 && c != ' ') {
                sb.append(Character.toUpperCase(c));
                cnt++;
            } else if(c == ' ') {
                sb.append(c);
                cnt = 0;
            } else {
                sb.append(Character.toLowerCase(c));
                cnt++;
            }
        }
        return sb.toString();
    }
}