package ua.ptah.maths.problem5;


class SmallestMultiple {


  //checks if NUM is divided without a reminder by all numbers is a range (0, DIV]
  private boolean isDivByRange(long num, int div) {
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
  private long smMult(int n) {
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


  String toString(int n) {
    return "The Smallest Multiple for " + n + " is: " + smMult(n);
  }
}
