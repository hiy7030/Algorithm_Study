import java.util.Arrays;
class Solution {
    public long solution(long n) {
        char[] c = Long.toString(n).toCharArray();

        Arrays.sort(c);

        String st = "";

        for(int i = c.length-1; i >= 0; i--) {
            st += String.valueOf(c[i]);
        }
        
        return Long.parseLong(st);
    }
}