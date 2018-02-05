package com.nasringlantz.projecteuler;

import org.junit.Test;

public class Problem5 {
   
   @Test 
   public void solution() {
      long answer = getSmallestNum(10);
      System.out.println(answer);
      answer = getSmallestNum(20);
      System.out.println(answer);
   }

   public long getSmallestNum(long num) {
      long result = 1;
      for (long i = 1; i <= num; i++) {
         result = (result * i) / gcd(i, result);
      }
      return result;
   }
   
   public long gcd(long a, long b) {
      if (b==0) return a;
      return gcd(b,a%b);
   }
}
