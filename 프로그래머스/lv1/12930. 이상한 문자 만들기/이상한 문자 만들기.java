class Solution {
    public String solution(String s) {
        int idx = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                if(idx % 2 == 0) sb.append(Character.toUpperCase(s.charAt(i)));
                else sb.append(Character.toLowerCase(s.charAt(i)));
                idx++;
            } else {
                idx = 0;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}