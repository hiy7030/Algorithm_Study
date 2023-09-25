class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int mid = total/num;
        int first = mid - ((num-1)/2);

        for(int i = 0; i < answer.length; i++) {
            answer[i] = first;
            first++;
        }
        return answer;
    }
}