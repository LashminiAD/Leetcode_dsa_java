class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int lr = 1;
        int rl = 1;
        int maxPro = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(lr==0) lr = 1;
            if(rl==0) rl = 1;

            lr *=nums[i];
            int j = n-i-1;
            rl *=nums[j];

            maxPro = Math.max(lr, Math.max(rl,maxPro));
        }
        return maxPro;
    }
}