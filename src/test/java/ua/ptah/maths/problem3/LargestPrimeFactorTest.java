package ua.ptah.maths.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPrimeFactorTest {

  private static final long LONG_1 = 8051L, LONG_2 = 10403L;

  @Test
  void testLargestPrime() {
    assertEquals(97L, LargestPrimeFactor.largestPrimeFactor(LONG_1));
    assertEquals(103L, LargestPrimeFactor.largestPrimeFactor(LONG_2));
  }

  //NB! create an alternative bullet proof calculation method for comparision so constants could be changed

}