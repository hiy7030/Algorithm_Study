import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(String.valueOf(chars));
        String answer = sb.reverse().toString();

        return answer;
    }
}