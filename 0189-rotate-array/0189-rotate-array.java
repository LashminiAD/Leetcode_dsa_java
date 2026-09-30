class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        ra(0, n-1, nums);
        ra(0, k-1, nums);
        ra(k, n-1, nums);
    }
    public void ra(int l , int r, int[] n){
        while(l<r){
            int t = n[l];
            n[l] = n[r];
            n[r] = t;

            l++; r--;
        }
    }
}