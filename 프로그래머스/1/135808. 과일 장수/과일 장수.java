import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] sc = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(sc, Comparator.reverseOrder());

        int sum = 0;

        for(int i = m-1; i < sc.length; i+=m){
            sum += (sc[i] * m);
        }

        return sum;
    }
}