import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer dealer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(dealer.nextToken());
        int m = Integer.parseInt(dealer.nextToken());

        StringTokenizer card = new StringTokenizer(br.readLine());
        int[] cards = new int[n];

        for(int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(card.nextToken());
        }

        int result = sum(cards, n, m);
        System.out.println(result);

    }
    public static int sum(int[] cards, int n, int m) {
        int max = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i < n-2; i++) {
            if(cards[i] > m) continue;

            for (int j = i+1; j < n-1; j++){
                if(cards[i] + cards[j] > m) continue;

                for (int k = j+1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum == m) {
                        return sum;
                    }
                    // 합한 값이 m보다 작거나 max보다 크면 max값 교체
                    if(max < sum && sum < m) {
                        max = sum;
                        a = i;
                        b = j;
                        c = k;
                    }
                }
            }
        }
        return max;
    }
}