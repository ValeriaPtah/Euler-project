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

    /*
     * To sum 1..n we use arithmetic progression sum formula: n(n + 1)/2
     * To sum squares we use: n(2n + 1)(n + 1)/6
     * Both formulas are derived taking into account that d = 1 (difference step)
     */
    static int sumSqDif(int natNumbersLimit) {
        int sumOfSquares = natNumbersLimit * (natNumbersLimit * 2 + 1) * (natNumbersLimit + 1) / 6;
        int sequenceSum = natNumbersLimit * (natNumbersLimit + 1) / 2;

        return sequenceSum * sequenceSum - sumOfSquares;
    }
}
