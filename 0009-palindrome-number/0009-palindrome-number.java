class Solution {
    public boolean isPalindrome(int x) {
        int r = 0;
        int og = x;
        int sign = 1;
        if(x < 0){
            return false;
        }
        while(x!=0){
            int d = x%10;
            r = r * 10 + d;
            x /= 10;
        }
        return og == r;
    }
}