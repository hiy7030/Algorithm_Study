import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        Map<Integer, int[]> keypad = new HashMap<>();
        keypad.put(-1, new int[]{3, 0});
        keypad.put(0, new int[]{3, 1});
        keypad.put(-2, new int[]{3, 2});

        int num = 1;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                keypad.put(num, new int[]{i, j});
                num++;
            }
        }

        int[] hands = new int[]{-1, -2};

        for(int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if(n == 1 || n == 4 || n == 7) {
                // 147이면 sb에 L를 저장하고, hands[0]의 값을 numbers[i]로 변경
                sb.append("L");
                hands[0] = n;
            } else if(n == 3 || n ==  6 || n == 9) {
                // 369이면 sb에 R를 저장하고, hands[1]의 값을 numbers[i]로 변경
                sb.append("R");
                hands[1] = n;
            } else {
                // 2580이면
                // Math.min(Math.abs(numbser[i]-hands[0]), Math.abs(num[i]-hands[1]))
                // 두 값이 같다면, hand값에 따라 저장하고 hands의 값을 변경
                int[] nPos = keypad.get(n);
                int[] leftPos = keypad.get(hands[0]);
                int[] rightPos = keypad.get(hands[1]);

                int right = Math.abs(nPos[0]-rightPos[0]) + Math.abs(nPos[1]-rightPos[1]);
                int left = Math.abs(nPos[0]-leftPos[0]) +Math.abs(nPos[1]-leftPos[1]);

                if(left > right) {
                    sb.append("R");
                    hands[1] = n;
                } else if(left < right) {
                    sb.append("L");
                    hands[0]= n;
                } else {
                    switch (hand) {
                        case "left" : sb.append("L"); hands[0]= n; break;
                        case "right" : sb.append("R"); hands[1] = n; break;
                    }
                }
            }
        }
        return sb.toString();
    }
}