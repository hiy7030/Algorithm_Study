import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 나무 수
        int n = Integer.parseInt(st.nextToken());
        // 집으로 가져가려는 나무의 길이
        int m = Integer.parseInt(st.nextToken());
        // 나무들~
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        // 절단기의 높이(h) 최대값 찾기
        // lt = 1, rt = arr의 최대값
        int lt = 1;
        int rt = arr[n-1];
        long result = 0;

        while (lt <= rt) {
            int mid = (lt + rt)/2;
            // count(mid) >= m
            if(count(mid, arr) >= m) {
                // mid값이 커져야 함
                result = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        System.out.println(result);
    }
    public static long count(int mid, int[] arr) {
        // arr의 요소들을 순회하면서 mid의 값을 빼고 합계가 m과 같아야 함.
        long sum = 0;

        for(int x : arr) {
            if(x >= mid) { // 음수값은 나오면 안됨
                sum += (x - mid);
            }
        }

        return sum;
    }
}