import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // k = 층수(0~14), n = 호(1~14)
        // 원하는 값 -> k-1층의 n호까지의 인원 합

        int t = Integer.parseInt(br.readLine());

        int[][] zero = new int[1][15];
        for(int i = 0; i < 15; i++) {
            zero[0][i] = i;
        }

        while (t != 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int result = totalResidents(zero, k, n);
            System.out.println(result);
            t--;
        }


    }
    static int totalResidents(int[][] zero, int k, int n) {
        // k == 0일 때 종료
        if(k == 0) {
            return zero[0][n];
        }
        int floor[][] = new int[1][15];

        int sum = 0;

        for(int i = 0; i < 15; i++) {
            sum += zero[0][i];
            floor[0][i] = sum;
        }

        return totalResidents(floor, --k, n);
    }
}