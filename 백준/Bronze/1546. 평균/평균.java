import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] score = new double[n];

        for(int i = 0; i < score.length; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(score); // 맨 마지막 점수가 최고점
        double totalScore = 0;

        for(int i = 0; i < score.length; i++) {
            totalScore += score[i]/score[n-1] * 100;

        }

        double result = totalScore / score.length;

        System.out.println(result);

    }
}
