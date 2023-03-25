import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i<n; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean check() throws IOException {
        // string 값을 입력 받는다.
        String str = br.readLine();
        // boolean[]에 흔적을 남긴다.
        boolean[] check = new boolean[26];
        int tmp = 0;

        // str.length()만큼 반복문
        for(int i = 0; i < str.length(); i++) {
            // 아스키코드
            // 다음 글자가 tmp와 같다면, 중복 검사하지 않고
            // 다음 글자가 tmp와 같지 않다면, 중복 검사를 한다.
            int num = str.charAt(i);
            if(tmp != num) {
                // check[num] = false -> 그룹단어 ok
                if(!check[num-'a']) {
                    // check[num] => true로 바꾸고, tmp => num바꿈
                    check[num-'a'] = true;
                    tmp = num;
                } else {
                    // 중복 검사 check[num] = true면? -> 그룹단어 아님
                    return false;
                }
            }
        }
        // 중복검사가 끝까지 정상적으로 이루어진 경우 그룹단어이다.
        return true;
    }
}