class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int x = Integer.parseInt(str[0]);
            String op = str[1];
            int y = Integer.parseInt(str[2]);
            int z = Integer.parseInt(str[4]);

            if(op.equals("+") && x+y == z) answer[i] = "O";
            else if(op.equals("-") && x-y==z) answer[i] = "O";
            else answer[i] = "X";
            
        }
        return answer;
    }
}