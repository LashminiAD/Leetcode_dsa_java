class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean []isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i*i<n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<n; j+=i){   //i=2 j=4,6,8 false 
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i =2; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;

    //or 
        int count = 0;
    for(boolean c : isPrime){
        if(c) count++;
    }
    return count;
}
    }
}
