class Solution {
    public int[] sortedSquares(int[] nums) {
        // int []sort = new int[nums.length];
        // for(int i=0; i<nums.length; i++){               for loop O(n)
        //     sort[i] = nums[i]*nums[i];        
        // }
        // Arrays.sort(sort);                              sort - o(n log n)
        // return sort;                               brute force time complexity => O(n)+O(nlogn)=O(nlogn)


        int n = nums.length;
        int[] res = new int[n];

        int l =0;
        int r = n-1;        
        int i = n-1;

        while(l<=r){                                          //Optimal (two pointers): O(n)
            int lSq = nums[l]*nums[l];
            int rSq = nums[r]*nums[r];

            if(lSq >= rSq){
                res[i] = lSq;
                l++;
            }else{
                res[i] = rSq;
                r--;
            }
        
            i--;
        }
        return res;
    }
}