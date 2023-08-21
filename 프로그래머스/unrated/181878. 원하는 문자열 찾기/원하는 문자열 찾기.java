class Solution {
    public int solution(String myString, String pat) {
        
        if(myString.length() < pat.length()) return 0;
        
        int answer = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if(myString.equals(pat)) return 1;
        
        int length = myString.length() - pat.length();
        
        for(int i = 0; i < length; i++) {
            String str = myString.substring(i, i + pat.length());
            if(str.equals(pat)) answer = 1;
        }
        
        return answer;
    }
}