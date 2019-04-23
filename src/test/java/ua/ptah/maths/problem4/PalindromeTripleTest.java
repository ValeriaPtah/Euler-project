package ua.ptah.maths.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeTripleTest {

  @Test
  void biggestPalindromeFromThreeDigitsTest() {
    assertEquals(906609, new PalindromeFromThreeDigits().biggestPalindromeFromThreeDigits());
  }

}