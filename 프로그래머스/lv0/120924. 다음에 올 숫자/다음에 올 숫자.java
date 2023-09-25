class Solution {
    public int solution(int[] common) {
        if (judge(common)) {
            return common[common.length-1] + (common[1]-common[0]);
        } else {
            return common[common.length-1] * (common[1]/common[0]);
        }
    }
    public boolean judge(int[] common) {
        if(common[0]-common[1] == common[1]-common[2]) return true;
        return false;
    }
}