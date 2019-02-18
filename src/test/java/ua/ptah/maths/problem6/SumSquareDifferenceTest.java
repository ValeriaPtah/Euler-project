package ua.ptah.maths.problem6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumSquareDifferenceTest {

  @Test
  void sumSqDif() {
    assertEquals(25164150, SumSquareDifference.sumSqDif(100));
  }
}