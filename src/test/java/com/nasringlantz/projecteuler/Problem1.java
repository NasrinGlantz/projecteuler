package com.nasringlantz.projecteuler;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class Problem1 {
   @Test
   public void testSolution() {
      long answer = getSumOfMultiples3And5(10);
      assertThat(answer).isEqualTo(23);
      getSumOfMultiples3And5(1000);
   }
   
   public long getSumOfMultiples3And5(long bound) {
      long answer = 0;
      for(int i = 0; i < bound; i++) {
         if (i%5 == 0 || i%3 == 0) {
            answer += i;
         }
      }
      System.out.println(answer);
      return answer;
   }
}
