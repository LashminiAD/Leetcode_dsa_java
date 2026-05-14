class Solution {
    public int differenceOfSums(int n, int m) {
        int sumD = 0;
        int sumND = 0;
        for(int i=1; i<=n; i++){
            if(i%m == 0){
                sumD += i;
            }
            else{
                sumND += i;
            }
        }
        int res = sumND-sumD;
        return res;
    }
}