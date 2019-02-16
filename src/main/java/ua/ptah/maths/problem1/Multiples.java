package ua.ptah.maths.problem1;

class Multiples {

  /*
   * finds a sum of all numbers below the LIMIT divided by MULTIPLIER
   * MULTIPLIER is also a first member of a progression
   */
  private static int sumOfArithmeticProgression(int multiplier, int limit) {
    int amountOfMembers = (limit - 1) / multiplier;
    int lastMember = multiplier + (multiplier * (amountOfMembers - 1));

    return amountOfMembers * (multiplier + lastMember) / 2;
  }

  /*
   * add two arithmetic progression with d = MULTIPLIER1 and d = MULTIPLIER2
   * but extract sum of (MULTIPLIER1 * MULTIPLIER2) to avoid duplicates (15 for 3 and 5)
   */
  static int sumOfMultiplesUpTo(int multiplier1, int multiplier2, int limit) {

    return sumOfArithmeticProgression(multiplier1, limit) + sumOfArithmeticProgression(multiplier2, limit)
        - sumOfArithmeticProgression(multiplier1 * multiplier2, limit);
  }
}
