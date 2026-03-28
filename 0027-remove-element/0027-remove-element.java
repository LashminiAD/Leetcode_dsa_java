class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}


//OR ---> Order doesn’t matter (faster in practice)


class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        while( k < n){
            if(nums[k] == val){
                nums[k] = nums[n-1];
                n--;
            }else{
            k++;
            }
        }
        return n;
    }
}
