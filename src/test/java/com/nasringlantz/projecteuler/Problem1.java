package com.nasringlantz.projecteuler;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class Problem1 {
   @Test
   public void testSolution() {
      long answer = getSumOfMultiples3And5(10);
      assertThat(answer).isEqualTo(23);
      getSumOfMultiples3And5(10);
   }
   
   public long getSumOfMultiples3And5(long bound) {
      long answer = 0;
      // SOLUTION
      System.out.print(answer);
      return answer;
   }
}
