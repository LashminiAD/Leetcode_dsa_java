class Solution {
    public boolean isPalindrome(int x) {
        int r = 0;
        int og = x;
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

//or optimal sol by half of the number

int r = 0;
if(n <0 || n%10 == 0 && n!=0){
    return false;
}
while(n > r){
    int d = n % 10;
    r = r * 10 + d;
    n /= 10;
}
return n == r || n == r/10;
