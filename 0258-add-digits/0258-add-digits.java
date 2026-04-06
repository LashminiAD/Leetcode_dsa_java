class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0; return 1 + (num - 1) % 9;
    }
}

//brute force

import java.util.*;
public class Main {
  
  static int countDig(int n){
    while(n >=10){
      int sum = 0;
      
      while(n > 0) {
        sum += n%10; //38 -> 8 , + 3 => 11 - 1 , + 1 
        n /=10; //11 = sum , = 2
    }
     n = sum; //11
    }
    return n;
  }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(countDig(n));
    }
}
