package ua.ptah.maths.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPrimeFactorTest {

  @Test
  void testLargestPrime() {
    assertEquals(97L, LargestPrimeFactor.largestPrimeFactor(8051L));
    assertEquals(103L, LargestPrimeFactor.largestPrimeFactor(10403L));
  }
}