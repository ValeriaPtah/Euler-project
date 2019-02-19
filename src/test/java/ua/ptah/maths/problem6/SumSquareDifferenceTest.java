package ua.ptah.maths.problem6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumSquareDifferenceTest {
  private static final int NATURAL_NUMBERS_LIMIT = 100;

  @Test
  void testSumSqDif() {
    assertEquals(25164150, SumSquareDifference.sumSqDif(NATURAL_NUMBERS_LIMIT));
  }
}