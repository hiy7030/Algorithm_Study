import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 상근이가 가지고 있는 카드의 개수
        int n = Integer.parseInt(br.readLine());
        // 상근이가 가지고 있는 카드
        int[] card = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        // 이분 탐색을 위해 상근이 카드는 정렬
        Arrays.sort(card);

        // 매치할 카드의 수
        int m = Integer.parseInt(br.readLine());
        // 매치할 카드
        int[] num = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int[] result = new int[m];
        // 이분탐색을 m만큼 할거임 lt = 0, rt = n-1
        // lt <= rt까지 반복
        for(int i = 0; i < m; i++) {
            int lt = 0;
            int rt = n-1;
            while (lt <= rt) {
                int mid = (lt + rt)/2;
                if(num[i] == card[mid]) {
                    result[i] = 1;
                    break;
                } else if (num[i] > card[mid]) {
                    lt = mid + 1;
                } else {
                    rt = mid - 1;
                }
            }
        }
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}