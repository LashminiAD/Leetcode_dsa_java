class Solution {
    public long sumAndMultiply(int n) {
        long x =0;
        long placeVal = 1;
        long sum =0;

        while(n > 0){
            int d = n%10;
            if(d != 0){
                x = d*placeVal + x;
                sum += d;
                placeVal *=10;
            }
            n/=10;
        }
        return x*sum;
    }
}