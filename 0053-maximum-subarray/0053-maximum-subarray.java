class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currMax = 0;

        for(int i = 0; i<nums.length; i++){
            currMax += nums[i];
            max = Math.max(max, currMax);

            if(currMax < 0)
            currMax = 0;
        }

        return max;
    }
}