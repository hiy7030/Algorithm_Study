import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        // 4개가 p로 같음 -> 1111 * p
        // 3개가 p로 같음 -> (10 * p * q)^2
        // 2개씩 p, q로 같음 -> (p + q) × |p - q|
        // 2개만 p로 같고 나머지 값은 q,r -> q * r
        int result = 0;

        Map<Integer, Integer> dice = new HashMap<>();
        dice.put(a, dice.getOrDefault(a, 0) + 1);
        dice.put(b, dice.getOrDefault(b, 0) + 1);
        dice.put(c, dice.getOrDefault(c, 0) + 1);
        dice.put(d, dice.getOrDefault(d, 0) + 1);
        
        List<Integer> keys = new ArrayList<>(dice.keySet());
        
        int size = dice.size();
        switch (size) {
            case 1 : result = 1111 * a; break;
            case 2 : if(dice.get(keys.get(0)) == 1 || dice.get(keys.get(1)) == 1) {
                int p = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                int q = dice.get(keys.get(1)) == 1 ? keys.get(1) : keys.get(0);
                result = (int)Math.pow(10*p+q, 2);
            } else {
                int p = keys.get(0);
                int q = keys.get(1);
                result = (p + q) * (Math.abs(p-q));
            } break;
            case 3 :
                int tmp = 1;
                for(int x : keys) { // value가 1인 것만
                    if(dice.get(x) == 1)  tmp *= x;
                }
                result = tmp;
                break;
            case 4 : int min = Integer.MAX_VALUE;
                for(int i = 0; i < keys.size(); i++) {
                    min = Math.min(min, keys.get(i));
                }
                result = min;
                break;
        }

        return result;
    }
}