class Solution {
    public String solution(String X, String Y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10];

        for(char c : X.toCharArray()) {
            cntX[c-'0']++;
        }
        for(char c : Y.toCharArray()){
            cntY[c-'0']++;
        }

        StringBuilder sb = new StringBuilder();
        // 9에서부터 x와y 중 작은 값으로 문자를 입력 -> 공통x면 0번이 됨
        for(int i = 9; i >= 0; i--){
            int count = Math.min(cntX[i], cntY[i]);
            for(int j = 0; j < count; j++){
                sb.append(i);
            }
        }
        if(sb.length() == 0) return "-1";

        String answer = sb.toString();
        if(answer.replaceAll("0", "").equals("")) answer = "0";

        return answer;
    }
}