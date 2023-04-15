import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nArr = makeArr(n, new StringTokenizer(br.readLine()));
        Arrays.sort(nArr);

        int m = Integer.parseInt(br.readLine());
        int[] mArr = makeArr(m, new StringTokenizer(br.readLine()));

        StringBuilder sb = new StringBuilder();

        // m의 요소의 개수만큼 반복문을 돌림
        for(int i = 0; i < m; i++) {
            // m의 요소를 n에서 찾음
            // n의 중간 지점 값과 비교하여, m의 요소보다 작으면 왼쪽을 버리고, 크면 오른쪽을 버림
            int left = 0;
            int right = n-1;
            boolean visit = false;
            // left가 right보다 작거나 같을떄까지 반복
            while (left<=right) {
                // mid 값과 m의 i번째 요소를 비교
                int mid = (left+right)/2;
                if(nArr[mid] == mArr[i]) {
                    sb.append(1).append("\n");
                    visit = true;
                    break;
                } else if (nArr[mid] > mArr[i]) {
                    // mid값도 버림
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
            if(!visit) {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static int[] makeArr(int n, StringTokenizer st) {
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        return arr;
    }
}
