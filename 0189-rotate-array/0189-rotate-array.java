class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; //remaining rotation
         reverse(nums, 0, n-1); //reverese all
         reverse(nums, 0, k-1); // 0 to k at first
         reverse(nums, k , n-1);// balance rev
    } 
        private void reverse(int[]nums, int start, int end){
            while(start < end){
                int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
            }
            
        }
}
