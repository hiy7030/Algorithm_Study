import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        // 입력받은 t의 수만큼 a와 b를 입력받아 더한 값을 반환
        int[] result = new int[t];

        for(int i = 0; i < t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            result[i] = a+b;
        }
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}