class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        char[] arr = code.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            
            if(mode == 0) {
                if(ch != '1' && i % 2 == 0) ret += ch;
                else if(ch == '1') mode = 1;
            } else {
                if(ch != '1' && i % 2 != 0) ret += ch;
                else if(ch == '1') mode = 0;
            }
        }
        if(ret.isEmpty()) return "EMPTY";
        return ret;
    }
}