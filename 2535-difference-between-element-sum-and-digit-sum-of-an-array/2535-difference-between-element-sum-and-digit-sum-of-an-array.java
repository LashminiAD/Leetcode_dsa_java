class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0;
        int dSum = 0;
        for(int i : nums){
            sum += i;
            while(i>0){
                int d = i%10;
                dSum += d;
                i/=10;
            }
        }
        int abs = Math.abs(sum - dSum);
        return abs;
    }
}