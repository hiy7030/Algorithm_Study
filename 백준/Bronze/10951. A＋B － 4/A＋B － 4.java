import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 다음값이 없으면 반복문 종료
        while (s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a+b);
        }
        

    }
}