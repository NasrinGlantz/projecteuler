package com.nasringlantz.projecteuler;

import org.junit.Test;

public class problem4 {

   @Test 
   public void testSolution() {
      long answer = getLargestPalindrome(100);
      System.out.println(answer);
      answer = getLargestPalindrome(1000);
      System.out.println(answer);
   }

   public long getLargestPalindrome (long num) {
      //int digitsNum = (int)(Math.log10(num)+1);
      int digitsNum = String.valueOf(num).length();
      long temp = 0, biggest = 0;
      if(digitsNum > 3) {
         for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
               temp = j*i;
               if (check(temp)) {
                  if (temp > biggest )
                  {
                     biggest = temp;
                  }
               }
            }
         }
      } else if (digitsNum > 2) {
         for (int i = 99; i >= 10; i--) {
            for (int j = 99; j >= 10; j--) {
               temp = j*i;
               if (check(temp)) {
                  if (temp > biggest )
                  {
                     biggest = temp;
                  }
               }
            }
         }
      }
      return biggest;
   }

   public boolean check(long num) {
      long temp = num, remainder = 0, reverse_num = 0;
      while(temp!=0)
      {
         remainder=temp%10;
         reverse_num=reverse_num*10+remainder;
         temp/=10;
      } 
      return (num == reverse_num);
   }
}
