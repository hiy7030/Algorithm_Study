class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = index;

            while (n > 0) {
                if(c == 122) c-=26;
                // skip에 존재하지 않는 경우
                if(skip.indexOf(c+1) == -1) {
                    c += 1;
                    n--;
                } else { // 존재 하는 경우
                    c += 1;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}