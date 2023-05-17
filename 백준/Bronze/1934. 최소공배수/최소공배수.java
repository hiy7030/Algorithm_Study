import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        // 최소공배수 : (a*b)/최대공약수
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(solution(a,b)).append("\n");
        }
        System.out.println(sb);
    }
    public static int solution(int a, int b) {
        int result = 0;

        for(int i = 1; i <= a && i <= b; i++) {

            if(a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return (a*b)/result;
    }
}