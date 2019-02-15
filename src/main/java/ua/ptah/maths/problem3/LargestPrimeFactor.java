package ua.ptah.maths.problem3;


class LargestPrimeFactor {

  //checks if a number is prime
  private boolean isPrime(long n) {
    boolean check = false;

    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        check = false;
        break;
      }
      else {
        check = true;
      }
    }

    return check;
  }


  //searches the largest prime divider (factor)
  long largestPrimeCheck(long n) {
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


  //initial method – for small numbers uses n/2, but for large sqr(n)
  //slow, not always precise
//   public double largestPrime (double n) {
//        double factor = 0.0;
//        double nHalf = n/2; //precise limit
//        double nSqr = Math.sqrt(n); //local limit
//
//        for (int i = 2; i < nSqr; i++) {
//            if (isPrime(i) && (n%i == 0))
//                factor = i;
//        }
//
//        return factor;
//    }

}