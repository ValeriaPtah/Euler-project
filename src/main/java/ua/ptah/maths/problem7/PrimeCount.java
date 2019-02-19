package ua.ptah.maths.problem7;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */

import ua.ptah.util.Prime;

class PrimeCount {

  static int nthPrime(int index) {
    if (index == 1) {
      return 2;
    }
    int nthPrime = 1;
    int currentIndex = 1;
    while (currentIndex < index) {
      nthPrime += 2;
      if (Prime.isPrime(nthPrime)) {
        currentIndex++;
      }
    }
    return nthPrime;
  }

}

