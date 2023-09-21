class Solution {
    public int solution(String before, String after) {
       int answer = 0;
        String str = after;

        for(int i = 0; i < before.length(); i++) {
            str = str.replaceFirst(String.valueOf(before.charAt(i)), "");
        }

        if(str.equals("")) answer = 1;
        return answer;
    }
}