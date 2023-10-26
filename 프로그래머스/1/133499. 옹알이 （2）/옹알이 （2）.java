class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s : babbling) {
            s = s.replaceAll("aya", "1")
                    .replaceAll("ye", "2")
                    .replaceAll("woo", "3")
                    .replaceAll("ma", "4");
            if(!s.matches(".*[a-z].*")&& !s.matches(".*(\\d)\\1.*")) answer++;
        }
        return answer;
    }
}