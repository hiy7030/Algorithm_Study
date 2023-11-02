class Solution {
    public String solution(String new_id) {
        // 1. 소문자로 변경
        String answer = new_id.toLowerCase();
        // 2. 알파벳 소문자, 숫자, -, _, . 를 제외한 모든 문자 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        // 3. .이 2번 이상 연속될 경우 .로 치환
        answer = answer.replaceAll("\\.{2,}", ".");
        // 4. 처음이나 끝에 .이 존재한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        // 5. 빈문자열이라면 "a" 대입
        if(answer.isEmpty()) answer = "aaa";
        // 6. 길이가 16자 이상이라면 첫 15개의 문자만 남겨둠 -> 제거 후 마침표로 끝나면 마침표 제거
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");
        // 7. 길이가 2자 이하라면 마지막 문자를 길이가 3이 될때까지 추가
        if(answer.length() <= 2 && !answer.isEmpty()) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        } else if(answer.isEmpty()) answer = "aaa";
        return answer;
    }
}