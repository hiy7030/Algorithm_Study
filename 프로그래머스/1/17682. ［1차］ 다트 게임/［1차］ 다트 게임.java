class Solution {
    public int solution(String dartResult) {
        String[] sArr = new String[3];

        int cnt = 0;
        while (cnt < 3) {
            String str = "";
            for(int i = 0; i < dartResult.length(); i++) {
                if(i == 0) str += dartResult.charAt(i);
                else if(i == 1 && dartResult.charAt(i) == '0') str += dartResult.charAt(i);
                else if(48<=dartResult.charAt(i)&&dartResult.charAt(i)<=57) {
                    dartResult = dartResult.substring(i);
                    break;
                } else {
                    str += dartResult.charAt(i);
                }
            }
            sArr[cnt] = str;
            cnt++;
        }

        int[] score = new int[3];

        for(int i = 0; i < sArr.length; i++) {
            int sum = 0;
            String num = "";
            for(int j = 0; j < sArr[i].length(); j++) {
                switch (sArr[i].charAt(j)) {
                    case 'S' : sum += Integer.parseInt(num); break;
                    case 'D' : sum += Math.pow(Integer.parseInt(num), 2); break;
                    case 'T' : sum += Math.pow(Integer.parseInt(num), 3); break;
                    case '*' : if(i > 0) score[i-1] *= 2; sum *= 2; break;
                    case '#' : sum *= -1;
                    default : num += sArr[i].charAt(j); break;
                }
            }
            score[i] = sum;
        }
        int answer = 0;
        for(int n : score) {
            answer += n;
        }
        return answer;
    }
}