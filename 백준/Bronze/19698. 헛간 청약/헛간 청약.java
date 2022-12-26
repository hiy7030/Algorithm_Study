import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 소의 수
        int w = Integer.parseInt(st.nextToken()); // 헛간 크기
        int h = Integer.parseInt(st.nextToken()); // 헛간 크기
        int l = Integer.parseInt(st.nextToken()); // 소 한마리 당 배정되는 공간

        int result = (w /l)*( h/l);
        System.out.println(Math.min(n, result));
    }
}