class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) {
                // ch + n -> 아스키코드를 넘어가면 -26
                ch += n;
                if(ch > 90) {
                    ch -= 26;
                }
            } else if (Character.isLowerCase(ch)) {
                ch += n;
                if(ch > 122) ch -= 26;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}