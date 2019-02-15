package ua.ptah.maths.problem2;

class EvenFib {

  /**
   * finds a sum of all even Fibonacci numbers below the LIMIT
   */
  static int evenFibonacciSum(int limit) {

    int fibPrev = 2;
    int fibCur = 8;
    int fibNext = 0;

    int sum = fibPrev + fibCur;

    while (fibNext <= limit) {
      sum += fibNext;
      fibNext = 4 * fibCur + fibPrev;
      fibPrev = fibCur;
      fibCur = fibNext;
    }

    return sum;
  }
}