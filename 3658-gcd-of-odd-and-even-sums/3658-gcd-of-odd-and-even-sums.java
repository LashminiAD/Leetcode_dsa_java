class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumE = 0;
        int sumO = 0;
        for(int i =1; i<=n*2; i++){
            if(i%2==0) sumE += i;
            else sumO += i; 
        }

        while(sumE != 0){
            int t = sumE;
            sumE = sumO % sumE;
            sumO = t;
        }
        return sumO;
    }
}