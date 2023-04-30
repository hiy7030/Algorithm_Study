import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n <= x <= m x에 소수를 구하라
        // 소수란 자기 자신과, 1로만 나누어지는 수
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        // false로 초기화
        boolean[] arr = new boolean[m+1];
        arr[0] = true;
        arr[1] = true;

        for(int i =  2; i <= Math.sqrt(arr.length); i++) {
            if(arr[i]) continue;
            for(int j = i*i; j < arr.length; j+=i){
                arr[j] = true;
            }
        }

        for(int i = n; i<= m; i++) {
            if(!arr[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}