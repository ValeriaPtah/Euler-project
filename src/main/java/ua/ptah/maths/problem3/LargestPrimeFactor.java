package ua.ptah.maths.problem3;

class LargestPrimeFactor {

  /*
   * searches for the largest prime divider (factor) of N
   */
  static long largestPrimeFactor(long n) {
    long nLoc = n;
    long factor = 3L;
    long lastFactor;
    double maxFactor = Math.sqrt(nLoc);

    if (nLoc % 2 == 0) {
      lastFactor = 2L;
      nLoc = nLoc / 2;
      while (nLoc % 2 == 0) {
        nLoc = nLoc / 2;
      }
    }
    else {
      lastFactor = 1;
    }

    while ((nLoc > 1) && (factor <= maxFactor)) {
      if (n % factor == 0) {
        nLoc = nLoc / factor;
        lastFactor = factor;
        while (nLoc % factor == 0) {
          nLoc = nLoc / factor;
        }
      }
      factor += 2;
    }

    if (nLoc == 1) {
      return lastFactor;
    }
    else {
      return nLoc;
    }
  }
}