package ua.ptah.maths.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.ptah.maths.problem2.EvenFib.evenFibonacciSum;

class EvenFibTest {

  @Test
  void testBruteForceEvenFibonacciSum() {
    assertEquals(4613732, evenFibonacciSum(4000000));
  }

}