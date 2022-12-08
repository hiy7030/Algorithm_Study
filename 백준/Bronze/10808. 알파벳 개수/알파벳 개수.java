import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 알파벳 개수 -> 26개 str.charAt(i)의 아스키코드로 개수 환산?
        int[] alpha = new int[26];

        for(int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i)-97]++;
        }

        for(int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}