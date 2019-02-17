package ua.ptah.maths.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestMultipleTest {
  private static final long DIV_LIMIT = 20L;

  @Test
  void testSmallestMultiple() {
    assertEquals(232792560, SmallestMultiple.smallestMultiple(DIV_LIMIT));
  }
}