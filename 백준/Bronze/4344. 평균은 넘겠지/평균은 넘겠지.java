import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        while (c != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            // 평균점수를 구하고, 평균값을 넘기는 학생 수를 k라고 할떄, result = k/n
            double average = list.stream().mapToInt(a -> a).average().getAsDouble();

            int k = 0;

            for(int i = 0; i < n; i++) {
                if(list.get(i) > average) k+=1;
            }

            double result = ((double) k/ n) * 100 ;
            System.out.println(String.format("%.3f", result) + "%" );
            c--;
        }
    }
}