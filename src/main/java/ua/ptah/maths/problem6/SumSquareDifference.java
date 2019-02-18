package ua.ptah.maths.problem6;

/*
 * The sum of the squares of the first ten natural numbers is:
 *            1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is:
 *            (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

class SumSquareDifference {
  private static final int NATURAL_NUMBERS_LIMIT = 100;

  static int sumSqDif() {
//    int sumOfSq = IntStream.rangeClosed(1, NATURAL_NUMBERS_LIMIT).map(i -> i * i).sum();
//    int sqOfSum = IntStream.rangeClosed(1, NATURAL_NUMBERS_LIMIT).sum();
    int sumOfSq = NATURAL_NUMBERS_LIMIT * (NATURAL_NUMBERS_LIMIT * 2 + 1) * (NATURAL_NUMBERS_LIMIT + 1) / 6;
    int sqOfSum = NATURAL_NUMBERS_LIMIT * (NATURAL_NUMBERS_LIMIT + 1) / 2;

    return sqOfSum * sqOfSum - sumOfSq;
  }

}
