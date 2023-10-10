class Solution {
    public int solution(int[][] sizes) {
       int max1 = 0;
        int min1 = 0;

        for(int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            max1 = Math.max(max, max1);
            min1 = Math.max(min, min1);
        }
        return max1 * min1;
    }
}