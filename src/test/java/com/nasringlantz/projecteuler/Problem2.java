package com.nasringlantz.projecteuler;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Problem2 {
   @Test
   public void testSolution() {
      long answer = getSumOfEvenInFibunacci(4000000);
      System.out.println(answer);
   }
   
   public long getSumOfEvenInFibunacci(long bound) {
      long fib = 0;
      long sum = 0;
      for (int i = 0; fib < bound; i++) {
         fib = getFib(i);
         if (fib % 2 == 0) {
            sum += fib;
         }
      }
      return sum;
   }
   
   public long getFib(long index){
      long answer;
      if (index == 0) {
         answer = 0;
      }
      else if (index == 1) {
         answer = 1;
      } else {
         answer = getFib(index-1) + getFib(index-2);
      }
      return answer;
   }
}

