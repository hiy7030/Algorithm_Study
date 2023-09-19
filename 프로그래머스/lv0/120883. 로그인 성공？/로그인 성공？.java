class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];

        String answer = "fail";

        for(int i = 0; i < db.length; i++) {
            // 아이디 일치x -> fail
            // 아이디 o pw x -> wrong pw
            if(db[i][0].equals(id)) {
                if(db[i][1].equals(pw)) {
                    answer = "login";
                } else {
                    answer = "wrong pw";
                }
            }
        }
        return answer;
    }
}