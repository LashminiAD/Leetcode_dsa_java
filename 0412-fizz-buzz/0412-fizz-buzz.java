class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i =1; i<=n; i++){
        if(i%3==0 && i%5==0){
            ans.add("FizzBuzz");
        }
        else if(i%3==0){
            ans.add("Fizz");
        }
        else if(i%5==0){
            ans.add("Buzz");
        }
        else{
            ans.add(String.valueOf(i));
        }
        }
        return ans;

    }
}

// or

import java.util.*;
public class Main {
  
  public static List<String> fizzBuzz(int n){
    List<String> res = new ArrayList<>();
    for(int i = 1; i<=n; i++){
      if(i%3 == 0 && i %5 ==0){
        res.add("FizzBuzz");
      }
      else if(i%3==0){
        res.add("Fizz");
      }
      else if (i%5==0){
        res.add("Buzz");
      }
      else{
        res.add(String.valueOf(i));
      }
    }
    return res;
    
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(fizzBuzz(n));
    }
}
