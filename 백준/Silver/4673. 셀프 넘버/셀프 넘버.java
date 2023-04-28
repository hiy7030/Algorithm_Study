public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        
        for(int i = 1; i < 10001; i++) {
            int n = d(i);
            
            if(n<= 10000) {
                check[n] = true;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= 10000; i++) {
            if(!check[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static int d(int num) {
        // 생성자가 가능한지 확인
        // 각자리의 수를 더해서 return 
        int sum = num;
        
        while (num != 0) {
            sum += num%10;
            num /= 10;
        }
        
        return sum;
    }
}