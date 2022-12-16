import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 전체 카드 개수
        int n = Integer.parseInt(st.nextToken());
        // O가 적힌 카드 개수
        int m = Integer.parseInt(st.nextToken());
        // 뒷면에 O를 적을 카드의 개수
        int k = Integer.parseInt(st.nextToken());
        // x의 개수 : n-m, X를 그릴 개수 : n-k
        // 같은 그림이 그려져 있는 카드의 최댓값
        int result = Math.min(m, k) + Math.min(n-m, n-k);
        System.out.println(result);
    }
}