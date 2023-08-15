class Solution {
    public int solution(int n, String control) {
        
        int result = n;
        
        for(int i = 0; i < control.length(); i++) {
            char ch = control.charAt(i);
            switch(ch) {
                case 'w' : result += 1;
                    break;
                case 's' : result -= 1;
                    break;
                case 'd' : result += 10;
                    break;
                case 'a' : result -= 10;
                    break;
            }
        }
        
        return result;
    }
}