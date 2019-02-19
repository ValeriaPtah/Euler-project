package ua.ptah.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeTest {

  @Test
  void testIsPrime() {
    assertTrue(Prime.isPrime(2));
    assertTrue(Prime.isPrime(37));
    assertTrue(!Prime.isPrime(1));
    assertTrue(!Prime.isPrime(-2));
    assertTrue(!Prime.isPrime(4));
    assertTrue(!Prime.isPrime(10));
  }
}