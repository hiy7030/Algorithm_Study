import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            sb.append(isPalindrome(br.readLine(), 0)).append("\n");
        }
        System.out.println(sb);
    }
    public static String isPalindrome(String str, int count) {
        return recursion(str, 0,str.length()-1, count);
    }
    public static String recursion(String str, int l, int r, int count) {
        count++;
        if(l >= r) return "1 " + count;
        else if (str.charAt(l) != str.charAt(r)) return "0 " + count;
        else return recursion(str, l+1, r-1, count);
    }
}