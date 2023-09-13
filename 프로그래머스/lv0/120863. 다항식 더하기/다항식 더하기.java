class Solution {
    public String solution(String polynomial) {
         String[] str = polynomial.split(" ");

        // x의 카운트와 숫자를 따로 저장해놓고
        int cnt = 0;
        int num = 0;

        for(String s : str) {
            if(s.contains("x")) {
                // x를 ""으로 변환하고 숫자를 cnt에 더한다.
                if(s.equals("x")) {
                    cnt++;
                } else {
                    cnt += Integer.parseInt(s.replace("x", ""));
                }
            } else if(s.equals("+")) {
                continue;
            } else {
                num += Integer.parseInt(s);
            }
        }

        String answer = "";
        
        if(num != 0 && cnt ==0) {
            answer = String.valueOf(num);
        } else if (cnt != 0 && num == 0) {
            if(cnt == 1) answer = "x";
            else  answer = cnt + "x";
        } else {
            if(cnt == 1) answer = "x + " + num;
            else answer = cnt + "x + " + num;
        }

        
        return answer;
    }
}