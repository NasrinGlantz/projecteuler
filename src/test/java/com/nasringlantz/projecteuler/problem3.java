package com.nasringlantz.projecteuler;

import org.junit.Test;

public class problem3 {
   
   @Test
   public void testSolution() {
      long answer = getLargestPrimeFactor(600851475143L);
      System.out.println(answer);
   }
   
   public long getLargestPrimeFactor(long number) {
      int i;
      for (i = 2; i <= number; i++) {
         if (number%i == 0) {
            number /= i;
            i--;
         }
      }
      System.out.println(i);
      return i;
   }
}
