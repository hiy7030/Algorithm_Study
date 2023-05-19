import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 문서의 개수
            int n = Integer.parseInt(st.nextToken());
            // 문서의 인덱스 번호 -> 해당 문서에 출력순서를 알아내야함
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            // 문서목록, 인덱스 -> 해당 문서 번호, 값 -> 우선순위 값
            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(solution(n, m, arr));
        }
    }
    public static int solution(int n, int m, int[] arr) {
        Queue<Number> que = new LinkedList<>();
        for(int i = 0; i < n; i++){
            que.add(new Number(i, arr[i]));
        }

        int result = 1;
        while (!que.isEmpty()) {
            Number tmp = que.poll();
            for(Number x : que) {
                if(tmp.line < x.line) {
                    que.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                if(tmp.id == m) return result;
                else result++;
            }
        }
        return result;
    }
    public static class Number{
        int id;
        int line;

        public Number(int id, int line) {
            this.id = id;
            this.line = line;
        }
    }
}
