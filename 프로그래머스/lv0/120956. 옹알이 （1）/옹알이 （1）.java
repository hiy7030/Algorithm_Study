class Solution {
    public int solution(String[] babbling) {
        // 해당 문자열을 공백으로 변경 후, 공백인 문자열만 세서 반환?
        
        int answer = 0;
        
        for(int i= 0; i < babbling.length; i++) {
            String str = babbling[i]
                .replaceAll("aya", "1")
                .replaceAll("ye", "1")
                .replaceAll("woo", "1")
                .replaceAll("ma", "1")
                .replaceAll("1","");;
            
            if(str.equals("")) answer++;
        }
        
        return answer;
    }
}