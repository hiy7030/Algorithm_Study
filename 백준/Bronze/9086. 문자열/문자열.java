import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // 테스트 갯수


        for(int i = 0; i<n; i++) {
            String str = s.next();
            String first = String.valueOf(str.charAt(0));
            String end = String.valueOf(str.charAt(str.length()-1));
            System.out.println(first+end);
        }
    }
}