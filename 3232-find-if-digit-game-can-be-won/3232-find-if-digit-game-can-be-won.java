class Solution {
    public boolean canAliceWin(int[] nums) {
        int dSum = 0, sSum = 0;
        for(int i : nums){
            if(i < 10) dSum += i; 
            else sSum += i;
        }
        return dSum > sSum || sSum > dSum;
    }
}