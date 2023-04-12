import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // black 체스판과, white 체스판을 비교해서 최소값을 가져오기
        // black 체스판으로 변경할 때 필요한 횟수와 white 체스판으로 변경할 때 필요한 횟수의 합은 전체 요소의 합과 같음
        String[] board = new String[n];
        for(int i = 0; i < n; i++) {
            board[i] = br.readLine();
        }

        int min = Integer.MAX_VALUE;
        // 체스판 자르기(8x8), 8을 뺴주는 이유는 인덱스가 넘칠 수 있어서
        for(int i = 0; i <= n-8; i++) {
            for(int j = 0; j <= m-8; j++) {
                int cnt = findNum(i, j, board);
                if(min > cnt) min = cnt;
            }
        }
        System.out.println(min);
    }
    public static int findNum(int startRow, int startCol, String[] board) {
        // 정답지
        String[] correct = new String[]{"WBWBWBWB", "BWBWBWBW"};
        int whiteCnt = 0;
        for(int i = 0; i < 8; i++) {
            // 전체 배열에서 자른 값의 인덱스부터 시작해야해서
            int row = startRow + i;
            for(int j = 0; j < 8; j++) {
                int col = startCol + j;
                if(board[row].charAt(col) != correct[row % 2].charAt(j)) {
                    whiteCnt++;
                }
            }
        }
        return Math.min(whiteCnt, 64-whiteCnt);
    }
}
