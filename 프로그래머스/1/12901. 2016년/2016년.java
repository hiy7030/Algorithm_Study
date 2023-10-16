class Solution {
    public String solution(int a, int b) {
        String[] days = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31,30,31,30,31};

        int total = b;

        for(int i = 0; i < a; i++) {
            total += month[i];
        }

        return days[total%7];
    }
}