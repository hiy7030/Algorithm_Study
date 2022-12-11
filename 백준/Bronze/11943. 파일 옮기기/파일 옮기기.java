import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 1번 바구니의 사과 a개와 오렌지 b개
        int a = Integer.parseInt(st1.nextToken());
        int b= Integer.parseInt(st1.nextToken());

        // 2번 바구니의 사과 c개와 오렌지 d개
        int c= Integer.parseInt(st2.nextToken());
        int d= Integer.parseInt(st2.nextToken());

        //1번 : 사과 a를 옮길 경우, 오렌지 d를 옮김
        //2번 : 사과 c를 옮길 경우, 오렌지 b를 옮김
        int result = Math.min((a+d),(c+b));
        System.out.println(result);
    }
}