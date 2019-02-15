package ua.ptah.maths.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.ptah.maths.problem1.Multiples.sumOfMultiples;

class MultiplesTest {

  private static final int DIV1 = 3, DIV2 = 5, LIMIT = 1000;

  @Test
  void testBruteForceMultiples() {
    int testSum = 0;

    for (int i = 0; i < LIMIT; i++) {
      if ((i % DIV1 == 0) || (i % DIV2 == 0)) {
        testSum += i;
      }
    }

    assertEquals(testSum, sumOfMultiples(DIV1, DIV2, LIMIT));
  }

}
