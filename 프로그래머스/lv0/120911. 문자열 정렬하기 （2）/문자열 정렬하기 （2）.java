class Solution {
    public String solution(String my_string) {
        String answer = my_string.chars()
                .map(x -> Character.toLowerCase(x))
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        return answer;
    }
}