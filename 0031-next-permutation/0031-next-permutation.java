class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for(int i = n-1; i > 0 ; i--){
            if(nums[i-1] < nums[i]) {
                pivot = i-1;
                break;
            }
        }

        if(pivot == -1){
            int l = 0;
            int r = n-1;
            while(l < r){
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                l++;
                r--;
            }
            return;
        }

        for(int j = n-1; j> pivot; j--){
            if(nums[j] > nums[pivot]){
                int t = nums[j];
                nums[j] = nums[pivot];
                nums[pivot] = t;
                break; 
            }
        }
        int l = pivot + 1;
        int r = n-1;
        while(l < r){
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                l++;
                r--;
            }
    }
}