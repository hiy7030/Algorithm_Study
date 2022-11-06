import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j =0; j<m; j++) {
                arr1[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j =0; j<m; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
        int[][] result = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j =0; j<m; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
                if(j == m-1) {
                    System.out.println(result[i][j]);
                } else {
                    System.out.print(result[i][j] + " ");
                }
            }
        }
    }
}