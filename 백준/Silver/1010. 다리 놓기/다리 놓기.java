import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] memo = new int[30][30];

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(bridge(m,n,memo));
        }
    }
    static int bridge(int n, int m, int[][] memo) {
        // 이미 탐색한 것
        if(memo[n][m] > 0) return memo[n][m];
        // n = m이 같으면 경우의 수는 1개
        if(n == m || m == 0) return memo[n][m] = 1;
        return memo[n][m] = bridge(n-1, m-1, memo) + bridge(n-1, m, memo);
    }
}