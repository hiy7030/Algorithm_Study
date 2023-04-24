import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        // nArr에서 mArr[i] 요소가 몇개인지 확인
        for(int i = 0; i < m; i++) {
            // lower인덱스부터 upper인덱스까지의 길이의 값이 답
            int key = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(" ");
        }
        System.out.println(sb);
    }
    public static int lowerBound(int[] arr, int key) {
        // 하한 key값 이상의 값을 나타냄 key와 같거나 작아야 함
        int left = 0;
        int right = arr.length;

        while (left<right) {
            int mid = (left + right) / 2;
            // arr[mid]가 key보다 크거나 같으면 right = mid =1
            if(key <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static int upperBound(int[] arr, int key) {
        // 상한 key값을 초과하는 값 key보다 커야함
        int left = 0;
        int right = arr.length;

        while (left<right) {
            int mid = (left + right) / 2;
            // key < arr[mid] right = mid
            if(key < arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}