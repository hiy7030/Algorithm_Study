import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 가지고 있는 랜선의 개수
        int n = Integer.parseInt(st.nextToken());
        // 필요한 랜선의 개수
        int k = Integer.parseInt(st.nextToken());
        // 랜선들
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // lt = 1, rt = arr에서 가장 큰 값
        long lt = 0;
        long rt = Arrays.stream(arr).max().getAsInt();

        rt++;

        while (lt < rt) {
            long mid = (lt+rt)/2;
            // arr의 모든 요소 / mid한 값의 합 : sum == k -> return mid
            // sum < k -> rt = mid -1
            // sum > k -> lt = mid +1
            long sum = 0;
            for(int i = 0; i < n; i++) {
                sum += (arr[i]/mid);
            }

            if(sum < k) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        System.out.println(lt - 1);
    }
}