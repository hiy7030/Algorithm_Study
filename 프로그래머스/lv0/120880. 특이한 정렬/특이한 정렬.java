import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
                List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numlist.length;i++) {
            list.add(numlist[i]);
        }

        Collections.sort(list, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1-n) != Math.abs(o2-n)) {
                    return Math.abs(o1-n)-Math.abs(o2-n);
                }
                else {return o2-o1;}
            }
        });

        int[] answer = new int[numlist.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}