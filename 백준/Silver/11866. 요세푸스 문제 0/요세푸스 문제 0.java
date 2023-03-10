import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 총 숫자의 개수
        int n = Integer.parseInt(st.nextToken());
        // 순서 번째
        int k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 큐에 n번쨰까지 값을 넣고
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            que.add(i);
        }

        while (!que.isEmpty()) {
            // k-1번째 까지 값을 빼 큐에 맨뒤에 저장
            for(int i = 0; i < k-1; i++) {
                int tmp = que.poll();
                que.add(tmp);
            }
            // k번째 숫자는 빼서 result에 저장
            sb.append(que.poll() + ", ");
        }
        
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}