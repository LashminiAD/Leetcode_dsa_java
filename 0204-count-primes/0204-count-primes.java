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
        for(int i =2; i<n; i++){  //  or  for(boolean c : isPrime) {
            if(isPrime[i]){      //             if(c) count++;
                count++;        //         return count; }
            }
        }
        return count;
    }
}

//or

import java.util.*;
class Main {
    
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i =2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
        static int primeNum(int n){
            int c = 0;
            for(int i =2; i<n; i++){
                if(isPrime(i)){
                    c++;
                }
            }
            return c;
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primeNum(n));
    
    }
}
