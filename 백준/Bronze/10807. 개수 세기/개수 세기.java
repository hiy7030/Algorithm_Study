import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //배열의 길이


        int[] arr = new int[n]; // 배열

        // 배열에 값 넣기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            }

        int v = s.nextInt();
        int result = 0;

        for(int i = 0; i< arr.length; i++) {
            if(arr[i] == v) {
                result += 1;
            }
        }

        System.out.println(result);

    }
}