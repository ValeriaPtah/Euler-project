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
  static int sumSqDif(int natNumLimit) {
//    int sumOfSq = IntStream.rangeClosed(1, natNumLimit).map(i -> i * i).sum();
//    int sqOfSum = IntStream.rangeClosed(1, natNumLimit).sum();
    int sumOfSq = natNumLimit * (natNumLimit * 2 + 1) * (natNumLimit + 1) / 6;
    int sqOfSum = natNumLimit * (natNumLimit + 1) / 2;
    System.out.println("smth");

    return sqOfSum * sqOfSum - sumOfSq;
  }

}
