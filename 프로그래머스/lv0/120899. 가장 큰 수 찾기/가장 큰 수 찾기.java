import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        int x = Arrays.stream(array).max().getAsInt();
        int y = Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(x);

        int[] answer = new int[]{x, y};
        return answer;
    }
}