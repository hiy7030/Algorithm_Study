import java.util.Collections;
import java.util.PriorityQueue;

class Solution
{
    public int solution(int []A, int []B)
    {
        PriorityQueue<Integer> max = new PriorityQueue<>();
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < A.length; i++) {
            max.offer(A[i]);
            min.offer(B[i]);
        }

        Integer sum = 0;

        for(int i = 0; i < A.length; i++) {
            sum += max.poll() * min.poll();
        }

        return sum;
    }
}