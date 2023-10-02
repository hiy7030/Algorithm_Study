import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < m; i++) {
            String s = "*";
            s = s.repeat(n);
            sb.append(s).append("\n");
        }

        System.out.println(sb.toString());
    }
}