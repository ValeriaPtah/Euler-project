package ua.ptah.util;

public class Prime {

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    else if (n < 4) {
      return true;
    }
    else if (n % 2 == 0) {
      return false;
    }
    else if (n < 9) {
      return true;
    }
    else if (n % 3 == 0) {
      return false;
    }
    else {
      int upperLimit = (int) Math.sqrt(n);
      int step = 5;
      while (step <= upperLimit) {
        if (n % step == 0) {
          return false;
        }
        if (n % (step + 2) == 0) {
          return false;
        }
        step += 6;
      }
      return true;
    }
  }
}
