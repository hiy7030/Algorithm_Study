import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 1234 -> 234 -> 342 -> 42 -> 24 -> 4
        // deque -> 앞뒤로 삽입과 출력이 가능한 자료구조
        Deque<Integer> d = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            d.add(i);
        }

        while (d.size() > 1) {
            // 1. 맨 위의 값을 버린다. -> poll()
            d.poll();
            // 2. 맨 위의 값을 맨 뒤에 붙인다. -> poll() and addLast()
            d.addLast(d.poll());
        }

        System.out.println(d.poll());
    }
}