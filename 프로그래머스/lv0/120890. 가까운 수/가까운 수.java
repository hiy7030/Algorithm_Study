class Solution {
    public int solution(int[] array, int n) {
        int[] gap = new int[array.length];
        
        for(int i = 0; i < gap.length; i++) {
            gap[i] = Math.abs(array[i]-n);
        }
        
        int min = Integer.MAX_VALUE;
        int idx = 0;
        
        for(int i = 0; i < gap.length; i++) {
            if (min > gap[i]) {
                min = gap[i];
                idx = i;
            } else if(min == gap[i]) {
                idx = array[idx] > array[i] ? i : idx;
            }
        }
        return array[idx];
    }
}