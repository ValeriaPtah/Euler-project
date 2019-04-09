package ua.ptah.maths.problem1;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */

class Multiples {

  /*
   * adds two arithmetic progression with d = MULTIPLIER1 and d = MULTIPLIER2
   * but extract sum of (MULTIPLIER1 * MULTIPLIER2) to avoid duplicates (15 for 3 and 5)
   */
  static int sumOfMultiplesUpTo(int multiplier1, int multiplier2, int limit) {

    return sumOfArithmeticProgression(multiplier1, limit) + sumOfArithmeticProgression(multiplier2, limit)
        - sumOfArithmeticProgression(multiplier1 * multiplier2, limit);
  }

  private static int sumOfArithmeticProgression(int multiplier, int limit) {
    int amountOfMembers = (limit - 1) / multiplier;
    int lastMember = multiplier + (multiplier * (amountOfMembers - 1));

    return amountOfMembers * (multiplier + lastMember) / 2;
  }
}
