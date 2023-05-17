import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n 키로그램 배달해야 함. 설탕 봉지는 3, 5키로그램으로 존재
        // 사용되는 봉지의 최소값이 정답이고, 정확하게 따질 수 없을 경우 -> -1 반환
        // 봉지를 제일 적게 사용한 경우 : 5키로만 쓴 경우
        int n = Integer.parseInt(br.readLine());

        if(n == 4 || n == 7) {
            System.out.println(-1);
        } else if (n % 5 == 0) {
            System.out.println(n/5);
        } else if (n%5 == 1 || n%5 == 3) {
            System.out.println((n/5) +1);
        } else if (n % 5 == 2 || n % 5 == 4) {
            System.out.println((n/5) +2);
        }
    }
}