package ua.ptah.maths.problem5;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

class SmallestMultiple {

  /*
   * checks if NUM is divided without a reminder by all numbers in a range (0, MAX_DIV]
   */
  private static boolean isDivByRange(long num, int max_div) {
//    return Stream.iterate(2, i -> i++).limit(max_div).allMatch(i -> num % i == 0);

    boolean check = true;

    for (int i = 2; i <= max_div; i++) {
      if (num % i != 0) {
        check = false;
        break;
      }
    }

    return check;
  }

  static long smallestMultiple(int n) {
    // return Stream.iterate(252L, i -> i++).limit(16761064320L).findFirst(i -> isDivByRange(i, n));
    // think about the type carry on

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
