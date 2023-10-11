class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // n은 지도의 한변 길이(지도는 정사각형)
        // arr들의 요소들은 10진수 -> 2진수로 변경해서 새로운 배열에 넣어야 함
        // 배열..각 요소를 배열로 int[n]해서 마지막 요소부터 값을 채운다면?
        // arr1[i]와 arr2[i]를 2진수로 변환해서 합친다.
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            int[] binary1 = binary(n, arr1[i]);
            int[] binary2 = binary(n, arr2[i]);

            String str = "";
            for(int j = 0; j < n; j++) {
                if(binary1[j] == 0 && binary2[j] == 0) {
                    // string = " "
                    str += " ";
                } else {
                    // string = "#"
                    str += "#";
                }
            }
            answer[i] = str;
        }
        return answer;
    }
    public int[] binary(int n, int num) {
        int[] arr = new int[n];

        for(int i = n-1; i >= 0; i--) {
            arr[i] = num%2;
            num/=2;
        }
        return arr;
    }
}