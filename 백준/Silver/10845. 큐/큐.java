import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> que = new LinkedList<>();
        int back = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push" : back = Integer.parseInt(st.nextToken());
                    que.add(back);
                    break;
                case "pop" : if(que.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(que.poll());
                }
                break;
                case "size" :
                    System.out.println(que.size());
                    break;
                case "empty" : if(que.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                break;
                case "front" : if (que.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(que.peek());
                }
                break;
                case "back" : if(que.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(back);
                }
            }
        }
    }
}