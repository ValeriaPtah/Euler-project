package ua.ptah.maths.problem7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeCountTest {
  private static final int PRIME_INDEX = 10001;


  @Test
  void testNthPrime() {
    assertEquals(104743, PrimeCount.nthPrime(PRIME_INDEX));
  }
}