package ua.ptah.maths.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.ptah.maths.problem2.EvenFib.evenFibonacciSum;

class EvenFibTest {

  private static final int LIMIT = 4000000;

  @Test
  void testBruteForceEvenFibonacciSum() {
    int sum = 0;

    int fibPrev = 1;
    int fibCur = 1;
    int fibNext = 0;

    while (fibNext <= LIMIT) {
      if (fibNext % 2 == 0) {
        sum += fibNext;
      }

      fibNext = fibPrev + fibCur;
      fibPrev = fibCur;
      fibCur = fibNext;
    }

    assertEquals(sum, evenFibonacciSum(LIMIT));
  }

}