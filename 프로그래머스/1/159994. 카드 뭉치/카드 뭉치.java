import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Queue<String> que1 = makeQueue(cards1);
        Queue<String> que2 = makeQueue(cards2);

        for(int i = 0; i < goal.length; i++) {
            String g = goal[i];
            if (!que1.isEmpty() && que1.peek().equals(g)) que1.poll();
            else if(!que2.isEmpty() && que2.peek().equals(g)) que2.poll();
            else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
     public Queue<String> makeQueue(String[] arr) {
        Queue<String> que = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            que.offer(arr[i]);
        }

        return que;
    }
}