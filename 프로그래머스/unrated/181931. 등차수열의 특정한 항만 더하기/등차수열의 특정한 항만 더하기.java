class Solution {
    public int solution(int a, int d, boolean[] included) {
        int length = included.length;
        int[] result = new int[length];
        result[0] = a;
        
        for(int i = 1; i<length; i++) {
            result[i] = result[i-1] + d;
        }
        
        int sum = 0;
        
        for(int j = 0; j < length; j++) {
            if(included[j]) {
                sum += result[j];
            }
        }
        
        return sum;
    }
}