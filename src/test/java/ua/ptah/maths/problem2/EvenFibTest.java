package ua.ptah.maths.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.ptah.maths.problem2.EvenFib.evenFibonacciLimitSum;

class EvenFibTest {

  @Test
  void testEvenFibonacciLimitSum() {
    assertEquals(4613732, evenFibonacciLimitSum(4000000));
  }

}