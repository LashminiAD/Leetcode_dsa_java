class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++; //4 - > 5

                return digits;
            }
            //greater than 9 -> 9+1 = 10
            digits[i] = 0; //0
        }
            int ans[] = new int[digits.length + 1];
            ans[0] = 1; // 1
            
            return ans; //10 or 100 , 1000
    }
}