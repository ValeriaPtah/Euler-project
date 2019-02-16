package ua.ptah.maths.problem5;

class SmallestMultiple {

  /**
   * checks if NUM is divided without a reminder by all numbers in a range (0, DIV]
   */
  private static boolean isDivByRange(long num, int div) {
    boolean check = true;

    for (int i = 2; i <= div; i++) {
      if (num % i != 0) {
        check = false;
        break;
      }
    }

    return check;
  }

  //brute force check
  static long smallestMultiple(int n) {
    long mult = 0L;

    //16 761 064 320 = 2 * 3 * 4 * ... * 18 * 19 * 20
    for (long i = 252L; i < 16761064320L; i++) {
      if (isDivByRange(i, n)) {
        mult = i;
        break;
      }
    }

    return mult;
  }
}
