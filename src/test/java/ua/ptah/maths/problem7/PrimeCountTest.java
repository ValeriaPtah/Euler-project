package ua.ptah.maths.problem7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeCountTest {

  @Test
  void testNthPrime() {
    assertEquals(104743, PrimeCount.nthPrime(10001));
  }
}