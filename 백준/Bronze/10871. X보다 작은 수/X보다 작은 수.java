import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int[] arr = new int[n];

        // 배열에 랜덤값을ㅇ 넣어준다.
        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            if(arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}