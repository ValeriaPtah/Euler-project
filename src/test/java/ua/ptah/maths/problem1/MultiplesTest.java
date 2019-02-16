package ua.ptah.maths.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplesTest {

  @Test
  void testMultiples() {
    assertEquals(233168, Multiples.sumOfMultiplesUpTo(3, 5, 1000));
  }
}
