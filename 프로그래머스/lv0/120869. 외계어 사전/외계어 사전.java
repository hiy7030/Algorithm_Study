class Solution {
    public int solution(String[] spell, String[] dic) {
        // 존재한다면 1, 존재하지 않는다면 2
        int answer = 1;
        
        // dic요소에 spell 요소가 전부 있다면 answer = 1, break
        // 하나라도 없다면 break answer = 2
        for(int i = 0; i < dic.length; i++) {
            int cnt = 0;
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].indexOf(spell[j])== -1) {
                    cnt = 1;
                    answer = 2;
                    break;
                }
            }
        if(cnt == 0){
            answer = 1;
            break;
        } 
        }
        
        return answer;
    }
}