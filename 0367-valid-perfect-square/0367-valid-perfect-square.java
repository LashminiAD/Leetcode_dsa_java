class Solution {
    public boolean isPerfectSquare(int num) {
        long n = num;
        while(n*n > num){
            n = (n + num/n)/2; // (16 + 16/16) / 2 = 17/2
        }
        return n*n==num;
    }
}

//or 

import java.util.*;
public class Main {
  
  static boolean perfSq(int n){
    
    int i = 1;
    while(i*i <= n){ // 1<=16
    if(i*i == n) return true;
      i++;
    }
    return false;
    
  }




    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(perfSq(n));
    }
}
