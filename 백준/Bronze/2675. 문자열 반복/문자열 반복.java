import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // s = 입력받을 문자열의 개수 r = 반복할 수, p = 반복할 문자열
        int s = Integer.parseInt(br.readLine());

        while (s != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String p = st.nextToken();

            String result = "";

            // p.charAt(i)를 r번만큼 반복 > 각 문자마다 해당과정 반복
            for(int i = 0; i < p.length(); i++) {
                for(int j = 0; j < r; j++) {
                    result += p.charAt(i);
                }
            }

            System.out.println(result);
            s--;
        }
    }
}