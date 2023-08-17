class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String result = "";

        for(int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int s = parts[i][0];
            int e = parts[i][1];
            result += str.substring(s, e+1);
        }

        return result;
    }
}